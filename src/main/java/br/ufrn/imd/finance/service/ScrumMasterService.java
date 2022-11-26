package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.ScrumMasterModel;
import br.ufrn.imd.finance.model.dto.ScrumMasterDto;
import br.ufrn.imd.finance.repository.ScrumMasterRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScrumMasterService extends GenericService<ScrumMasterModel, ScrumMasterDto> {
    private ScrumMasterRepository scrumMasterRepository;

    @Override
    protected GenericRepository<ScrumMasterModel> getRepository() {
        return this.scrumMasterRepository;
    }

    @Autowired
    public void setScrumMasterRepository(ScrumMasterRepository scrumMasterRepository) {
        this.scrumMasterRepository = scrumMasterRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ScrumMasterDto scrumMasterDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
