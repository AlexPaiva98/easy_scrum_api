package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.UserStorieModel;
import br.ufrn.imd.scrum.model.dto.UserStorieDto;
import br.ufrn.imd.scrum.repository.UserStorieRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStorieService extends GenericService<UserStorieModel, UserStorieDto> {
    private UserStorieRepository userStorieRepository;

    @Override
    protected GenericRepository<UserStorieModel> getRepository() {
        return this.userStorieRepository;
    }

    @Autowired
    public void setUserStorieRepository(UserStorieRepository userStorieRepository) {
        this.userStorieRepository = userStorieRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, UserStorieDto userStorieDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
