package br.ufrn.imd.scrum.model;

import br.ufrn.imd.scrum.model.enumerate.StatusParticipantEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class ParticipantModel extends AbstractModel {
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private DeveloperModel developer;
    @NotNull
    private StatusParticipantEnum status;

    public ParticipantModel() {
        this.setDeveloper(new DeveloperModel());
        this.setStatus(StatusParticipantEnum.DEFAULT);
    }

    public ParticipantModel(DeveloperModel developer, StatusParticipantEnum status) {
        this.setDeveloper(developer);
        this.setStatus(status);
    }

    public DeveloperModel getDeveloper() {
        return developer;
    }

    public void setDeveloper(DeveloperModel developer) {
        this.developer = developer;
    }

    public StatusParticipantEnum getStatus() {
        return status;
    }

    public void setStatus(StatusParticipantEnum status) {
        this.status = status;
    }
}
