package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.ProjectModel;
import br.ufrn.imd.scrum.model.dto.ProjectDto;
import br.ufrn.imd.scrum.repository.ProjectRepository;
import br.ufrn.imd.springcrud.exception.EntityNotFoundException;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProjectService extends GenericService<ProjectModel, ProjectDto> {
    private ProjectRepository projectRepository;
    private PersonService personService;

    @Override
    protected GenericRepository<ProjectModel> getRepository() {
        return this.projectRepository;
    }

    @Autowired
    public void setProjectRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ProjectDto projectDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }

    public Collection<ProjectDto> getProjectsByPerson(Long personId) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        try {
            this.getPersonService().findById(personId);
        } catch (EntityNotFoundException entityNotFoundException) {
            exceptionHelper.add("person not found (id = "+ personId + ")");
        }
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
        return this.convertToDTOList(this.projectRepository.findByActiveTrueAndScrumMaster_Person_IdOrTeams_Participants_Developer_Person_IdOrderByNameAsc(personId, personId));
    }
}
