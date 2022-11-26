package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.SprintModel;
import br.ufrn.imd.finance.model.dto.SprintDto;
import br.ufrn.imd.finance.repository.SprintRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SprintService extends GenericService<SprintModel, SprintDto> {
    private SprintRepository sprintRepository;

    @Override
    protected GenericRepository<SprintModel> getRepository() {
        return this.sprintRepository;
    }

    @Autowired
    public void setSprintRepository(SprintRepository sprintRepository) {
        this.sprintRepository = sprintRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, SprintDto sprintDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
