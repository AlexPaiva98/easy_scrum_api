package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.ProjectModel;
import br.ufrn.imd.scrum.model.dto.ProjectDto;
import br.ufrn.imd.scrum.repository.ProjectRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends GenericService<ProjectModel, ProjectDto> {
    private ProjectRepository projectRepository;

    @Override
    protected GenericRepository<ProjectModel> getRepository() {
        return this.projectRepository;
    }

    @Autowired
    public void setProjectRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
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
}
