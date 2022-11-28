package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.ProjectModel;
import br.ufrn.imd.scrum.model.dto.ProjectDto;
import br.ufrn.imd.scrum.service.ProjectService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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

    @GetMapping({"person"})
    public ResponseEntity<Collection<ProjectDto>> findByPerson(@RequestParam("personId") Long personId) throws ValidationException {
        return ResponseEntity.ok(this.projectService.getProjectsByPerson(personId));
    }
}
