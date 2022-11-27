package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.ParticipantModel;
import br.ufrn.imd.scrum.model.dto.ParticipantDto;
import br.ufrn.imd.scrum.repository.ParticipantRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService extends GenericService<ParticipantModel, ParticipantDto> {
    private ParticipantRepository participantRepository;

    @Override
    protected GenericRepository<ParticipantModel> getRepository() {
        return this.participantRepository;
    }

    @Autowired
    public void setParticipantRepository(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ParticipantDto participantDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
