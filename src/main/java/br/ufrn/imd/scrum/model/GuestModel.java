package br.ufrn.imd.scrum.model;

import br.ufrn.imd.scrum.model.enumerate.CategoryGuestEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class GuestModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(nullable = false)
    private PersonModel person;
    @NotNull
    private CategoryGuestEnum category;

    public GuestModel() {
        this.setPerson(new PersonModel());
        this.setCategory(CategoryGuestEnum.DEFAULT);
    }

    public GuestModel(PersonModel person, CategoryGuestEnum category) {
        this.setPerson(person);
        this.setCategory(category);
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }

    public CategoryGuestEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryGuestEnum category) {
        this.category = category;
    }
}
