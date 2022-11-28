package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeveloperModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(nullable = false)
    private PersonModel person;

    public DeveloperModel() {
        this.setPerson(new PersonModel());
    }

    public DeveloperModel(PersonModel person) {
        this.setPerson(person);
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }
}
