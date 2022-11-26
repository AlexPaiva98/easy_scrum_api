package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.finance.model.enumerate.CategoryGuestEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class GuestDto extends AbstractDto {
    private PersonDto person;
    private CategoryGuestEnum category;

    public GuestDto() {
        super();
        this.setPerson(new PersonDto());
        this.setCategory(CategoryGuestEnum.DEFAULT);
    }

    public GuestDto(Long id, PersonDto person, CategoryGuestEnum category) {
        super(id);
        this.setPerson(person);
        this.setCategory(category);
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public CategoryGuestEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryGuestEnum category) {
        this.category = category;
    }
}
