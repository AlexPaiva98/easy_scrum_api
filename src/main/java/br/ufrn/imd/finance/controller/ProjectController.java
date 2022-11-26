package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.ProjectModel;
import br.ufrn.imd.finance.model.dto.ProjectDto;
import br.ufrn.imd.finance.service.ProjectService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController extends GenericController<ProjectModel, ProjectDto> {
    private ProjectService projectService;

    @Override
    protected GenericService<ProjectModel, ProjectDto> getService() {
        return this.projectService;
    }

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }
}
