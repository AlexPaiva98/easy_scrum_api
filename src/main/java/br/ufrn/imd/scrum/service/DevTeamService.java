package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.DevTeamModel;
import br.ufrn.imd.scrum.model.dto.DevTeamDto;
import br.ufrn.imd.scrum.repository.DevTeamRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevTeamService extends GenericService<DevTeamModel, DevTeamDto> {
    private DevTeamRepository devTeamRepository;

    @Override
    protected GenericRepository<DevTeamModel> getRepository() {
        return this.devTeamRepository;
    }

    @Autowired
    public void setDevTeamRepository(DevTeamRepository devTeamRepository) {
        this.devTeamRepository = devTeamRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, DevTeamDto devTeamDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
