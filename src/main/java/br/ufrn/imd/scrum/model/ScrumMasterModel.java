package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "scrum_master")
public class ScrumMasterModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonModel person;

    public ScrumMasterModel() {
        this.setPerson(new PersonModel());
    }

    public ScrumMasterModel(PersonModel person) {
        this.setPerson(person);
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }
}