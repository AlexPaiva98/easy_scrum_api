package br.ufrn.imd.finance.model;

import br.ufrn.imd.finance.model.enumerate.CategoryGuestEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class GuestModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
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
