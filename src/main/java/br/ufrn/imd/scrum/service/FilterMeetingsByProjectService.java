package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.dto.MeetingDto;
import br.ufrn.imd.springcrud.exception.EntityNotFoundException;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.service.FilterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service
public class FilterMeetingsByProjectService implements FilterService<MeetingDto> {
    private MeetingService meetingService;
    private PersonService personService;
    private ProjectService projectService;

    public MeetingService getMeetingService() {
        return meetingService;
    }

    @Autowired
    public void setMeetingService(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    public PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public String getName() {
        return "filter_by_project";
    }

    @Override
    public void validate(Map<String, String> parameters) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /* Check parameter existence */
        if (!parameters.containsKey("personId")) {
            exceptionHelper.add("there is no parameter personId");
        } else {
            try {
                Long id = Long.valueOf(parameters.get("personId"));
                try {
                    this.getPersonService().findById(id);
                } catch (EntityNotFoundException entityNotFoundException) {
                    exceptionHelper.add("person not found (id = "+ id + ")");
                }
            } catch (NumberFormatException numberFormatException) {
                exceptionHelper.add("invalid personId parameter value");
            }
        }
        if (!parameters.containsKey("projectId")) {
            exceptionHelper.add("there is no parameter projectId");
        } else {
            try {
                Long id = Long.valueOf(parameters.get("projectId"));
                try {
                    this.getProjectService().findById(id);
                } catch (EntityNotFoundException entityNotFoundException) {
                    exceptionHelper.add("project not found (id = "+ id + ")");
                }
            } catch (NumberFormatException numberFormatException) {
                exceptionHelper.add("invalid projectId parameter value");
            }
        }
        if (!parameters.containsKey("limit")) {
            exceptionHelper.add("there is no parameter limit");
        } else {
            if (Integer.valueOf(parameters.get("limit")) < 1) {
                exceptionHelper.add("limit must be more than 0");
            }
        }
        if (!parameters.containsKey("page")) {
            exceptionHelper.add("there is no parameter limit");
        } else {
            if (Integer.valueOf(parameters.get("limit")) < 0) {
                exceptionHelper.add("limit must be more than -1");
            }
        }
        /* Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }

    @Override
    public Collection<MeetingDto> filter(Map<String, String> parameters) {
        return this.getMeetingService().convertToDTOList(
                this.getMeetingService().getMeetingsByProject(
                        Long.valueOf(parameters.get("personId")),
                        Long.valueOf(parameters.get("projectId")),
                        Integer.valueOf(parameters.get("limit")),
                        Integer.valueOf(parameters.get("page"))));
    }
}
