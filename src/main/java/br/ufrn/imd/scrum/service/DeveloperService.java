package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.DeveloperModel;
import br.ufrn.imd.scrum.model.dto.DeveloperDto;
import br.ufrn.imd.scrum.repository.DeveloperRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService extends GenericService<DeveloperModel, DeveloperDto> {
    private DeveloperRepository developerRepository;

    @Override
    protected GenericRepository<DeveloperModel> getRepository() {
        return this.developerRepository;
    }

    @Autowired
    public void setDeveloperRepository(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, DeveloperDto developerDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
