package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.MeetingModel;
import br.ufrn.imd.finance.model.dto.MeetingDto;
import br.ufrn.imd.finance.repository.MeetingRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService extends GenericService<MeetingModel, MeetingDto> {
    private MeetingRepository meetingRepository;

    @Override
    protected GenericRepository<MeetingModel> getRepository() {
        return this.meetingRepository;
    }

    @Autowired
    public void setMeetingRepository(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, MeetingDto meetingDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
