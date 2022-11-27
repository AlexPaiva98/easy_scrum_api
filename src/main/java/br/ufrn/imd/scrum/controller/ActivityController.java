package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.ActivityModel;
import br.ufrn.imd.scrum.model.dto.ActivityDto;
import br.ufrn.imd.scrum.service.ActivityService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController extends GenericController<ActivityModel, ActivityDto> {
    private ActivityService activityService;

    @Override
    protected GenericService<ActivityModel, ActivityDto> getService() {
        return this.activityService;
    }

    @Autowired
    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }
}
