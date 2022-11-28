package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.GuestModel;
import br.ufrn.imd.scrum.model.dto.GuestDto;
import br.ufrn.imd.scrum.repository.GuestRepository;
import br.ufrn.imd.springcrud.exception.EntityNotFoundException;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService extends GenericService<GuestModel, GuestDto> {
    private GuestRepository guestRepository;
    private PersonService personService;
    private MeetingService meetingService;

    @Override
    protected GenericRepository<GuestModel> getRepository() {
        return this.guestRepository;
    }

    @Autowired
    public void setGuestRepository(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public MeetingService getMeetingService() {
        return meetingService;
    }

    @Autowired
    public void setMeetingService(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, GuestDto guestDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        if (validationTypeUtil == ValidationTypeUtil.CREATE || validationTypeUtil == ValidationTypeUtil.UPDATE_ALL) {
            if (guestDto.getPerson() == null) {
                exceptionHelper.add("invalid person");
            } else {
                try{
                    this.getPersonService().findById(guestDto.getPerson().getId());
                } catch (EntityNotFoundException entityNotFoundException) {
                    exceptionHelper.add("person not found (id = "+ guestDto.getPerson().getId() + ")");
                }
            }
            if (guestDto.getCategory() == null) {
                exceptionHelper.add("invalid category");
            }
        }
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
