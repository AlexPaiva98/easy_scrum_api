package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.MeetingModel;
import br.ufrn.imd.scrum.model.dto.MeetingDto;
import br.ufrn.imd.scrum.repository.MeetingRepository;
import br.ufrn.imd.springcrud.exception.EntityNotFoundException;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class MeetingService extends GenericService<MeetingModel, MeetingDto> {
    private MeetingRepository meetingRepository;
    private ProjectService projectService;
    private PersonService personService;

    @Override
    protected GenericRepository<MeetingModel> getRepository() {
        return this.meetingRepository;
    }

    @Autowired
    public void setMeetingRepository(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    public PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, MeetingDto meetingDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        if (validationTypeUtil == ValidationTypeUtil.CREATE || validationTypeUtil == ValidationTypeUtil.UPDATE_ALL) {
            if (meetingDto.getLink().isEmpty()) {
                exceptionHelper.add("invalid link");
            }
            if (meetingDto.getDatetime() == null) {
                exceptionHelper.add("invalid datetime");
            }
            if (meetingDto.getProject() == null) {
                exceptionHelper.add("invalid project");
            } else {
                try {
                    this.getProjectService().findById(meetingDto.getProject().getId());
                } catch (EntityNotFoundException entityNotFoundException) {
                    exceptionHelper.add("project not found (id = "+ meetingDto.getProject().getId() + ")");
                }
            }
            if (meetingDto.getGuests().isEmpty()) {
                exceptionHelper.add("invalid guests");
            }
            if (meetingDto.getCategory() == null) {
                exceptionHelper.add("invalid category");
            }
        }
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }

    public Collection<MeetingDto> getMeetingsByPerson(Long personId, Integer lim, Integer pg) throws ValidationException {
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
        return this.convertToDTOList(this.meetingRepository.findByGuests_Person_IdAndActiveTrueOrderByDatetimeDesc(personId, PageRequest.of(pg, lim)));
    }

    public List<MeetingModel> getMeetingsByProject(Long personId, Long projectId, Integer lim, Integer pg) {
        return this.meetingRepository.findByGuests_Person_IdAndProject_IdAndActiveTrueOrderByDatetimeDesc(personId, projectId, PageRequest.of(pg, lim));
    }

    private Date getYesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    private Date getTomorrow() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +1);
        return cal.getTime();
    }

    public Collection<MeetingDto> getMeetingsByTodayDate(Long personId) throws ValidationException {
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
        return this.convertToDTOList(this.meetingRepository.findByGuests_Person_IdAndActiveTrueAndDatetimeBetweenOrderByDatetimeAsc(personId, this.getYesterday(), this.getTomorrow()));
    }
}
