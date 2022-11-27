package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class ScrumMasterDto extends AbstractDto {
    private PersonDto person;

    public ScrumMasterDto() {
        super();
        this.setPerson(new PersonDto());
    }

    public ScrumMasterDto(Long id, PersonDto person) {
        super(id);
        this.setPerson(person);
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
