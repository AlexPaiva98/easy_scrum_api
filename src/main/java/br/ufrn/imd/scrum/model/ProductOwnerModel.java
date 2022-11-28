package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

@Entity
public class ProductOwnerModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(nullable = false)
    private PersonModel person;
    @ManyToOne
    @JoinColumn(nullable = false)
    private CompanyModel company;

    public ProductOwnerModel() {
        this.setPerson(new PersonModel());
        this.setCompany(new CompanyModel());
    }

    public ProductOwnerModel(PersonModel person, CompanyModel company) {
        this.setPerson(person);
        this.setCompany(company);
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }
}
