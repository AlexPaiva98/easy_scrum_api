package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class ActivityDto extends AbstractDto {
    private ProjectDto project;
    private UserStorieDto userStorie;
    private DeveloperDto responsible;

    public ActivityDto() {
        super();
        this.setProject(new ProjectDto());
        this.setUserStorie(new UserStorieDto());
        this.setResponsible(new DeveloperDto());
    }

    public ActivityDto(Long id, ProjectDto project, UserStorieDto userStorie, DeveloperDto responsible) {
        super(id);
        this.setProject(project);
        this.setUserStorie(userStorie);
        this.setResponsible(responsible);
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public UserStorieDto getUserStorie() {
        return userStorie;
    }

    public void setUserStorie(UserStorieDto userStorie) {
        this.userStorie = userStorie;
    }

    public DeveloperDto getResponsible() {
        return responsible;
    }

    public void setResponsible(DeveloperDto responsible) {
        this.responsible = responsible;
    }
}
