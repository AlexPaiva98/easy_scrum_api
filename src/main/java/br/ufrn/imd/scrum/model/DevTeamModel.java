package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dev_team")
public class DevTeamModel extends AbstractModel {
    @NotBlank
    private String surname;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectModel project;
    @ManyToMany
    @JoinTable(name = "dev_team_participant", joinColumns = {@JoinColumn(name = "participant_id") }, inverseJoinColumns = { @JoinColumn(name = "dev_team_id") })
    private Set<ParticipantModel> participants;

    public DevTeamModel() {
        this.setSurname("");
        this.setProject(new ProjectModel());
        this.setParticipants(new HashSet<ParticipantModel>());
    }

    public DevTeamModel(String surname, ProjectModel project, Set<ParticipantModel> participants) {
        this.setSurname(surname);
        this.setProject(project);
        this.setParticipants(participants);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel project) {
        this.project = project;
    }

    public Set<ParticipantModel> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<ParticipantModel> participants) {
        this.participants = participants;
    }
}
