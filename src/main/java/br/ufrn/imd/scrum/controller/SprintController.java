package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.SprintModel;
import br.ufrn.imd.scrum.model.dto.SprintDto;
import br.ufrn.imd.scrum.service.SprintService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sprints")
public class SprintController extends GenericController<SprintModel, SprintDto> {
    private SprintService sprintService;

    @Override
    protected GenericService<SprintModel, SprintDto> getService() {
        return this.sprintService;
    }

    @Autowired
    public void setSprintService(SprintService sprintService) {
        this.sprintService = sprintService;
    }
}
