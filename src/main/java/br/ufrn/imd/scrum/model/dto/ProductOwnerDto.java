package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class ProductOwnerDto extends AbstractDto {
    private PersonDto person;
    private CompanyDto company;

    public ProductOwnerDto() {
        super();
        this.setPerson(new PersonDto());
        this.setCompany(new CompanyDto());
    }

    public ProductOwnerDto(Long id, PersonDto person, CompanyDto company) {
        super(id);
        this.setPerson(person);
        this.setCompany(company);
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }
}
