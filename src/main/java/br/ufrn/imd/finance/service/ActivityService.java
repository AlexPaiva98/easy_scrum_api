package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.ActivityModel;
import br.ufrn.imd.finance.model.dto.ActivityDto;
import br.ufrn.imd.finance.repository.ActivityRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService extends GenericService<ActivityModel, ActivityDto> {
    private ActivityRepository activityRepository;

    @Override
    protected GenericRepository<ActivityModel> getRepository() {
        return this.activityRepository;
    }

    @Autowired
    public void setActivityRepository(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ActivityDto activityDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
