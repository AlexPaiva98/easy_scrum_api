package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ActivityModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(nullable = false)
    private ProjectModel project;
    @ManyToOne
    @JoinColumn(nullable = false)
    private UserStorieModel userStorie;
    @ManyToOne
    @JoinColumn(nullable = false)
    private DeveloperModel responsible;

    public ActivityModel() {
        this.setProject(new ProjectModel());
        this.setUserStorie(new UserStorieModel());
        this.setResponsible(new DeveloperModel());
    }

    public ActivityModel(ProjectModel project, UserStorieModel userStorie, DeveloperModel responsible) {
        this.setProject(project);
        this.setUserStorie(userStorie);
        this.setResponsible(responsible);
    }

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel project) {
        this.project = project;
    }

    public UserStorieModel getUserStorie() {
        return userStorie;
    }

    public void setUserStorie(UserStorieModel userStorie) {
        this.userStorie = userStorie;
    }

    public DeveloperModel getResponsible() {
        return responsible;
    }

    public void setResponsible(DeveloperModel developer) {
        this.responsible = developer;
    }
}
