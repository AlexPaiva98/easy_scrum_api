package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.DeveloperModel;
import br.ufrn.imd.scrum.model.dto.DeveloperDto;
import br.ufrn.imd.scrum.service.DeveloperService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/developers")
public class DeveloperController extends GenericController<DeveloperModel, DeveloperDto> {
    private DeveloperService developerService;

    @Override
    protected GenericService<DeveloperModel, DeveloperDto> getService() {
        return this.developerService;
    }

    @Autowired
    public void setDeveloperService(DeveloperService developerService) {
        this.developerService = developerService;
    }
}
