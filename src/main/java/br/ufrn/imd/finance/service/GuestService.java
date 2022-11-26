package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.GuestModel;
import br.ufrn.imd.finance.model.dto.GuestDto;
import br.ufrn.imd.finance.repository.GuestRepository;
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

    @Override
    protected GenericRepository<GuestModel> getRepository() {
        return this.guestRepository;
    }

    @Autowired
    public void setGuestRepository(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, GuestDto guestDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
