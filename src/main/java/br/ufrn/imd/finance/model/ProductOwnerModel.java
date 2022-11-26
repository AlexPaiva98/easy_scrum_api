package br.ufrn.imd.finance.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductOwnerModel extends PersonModel {
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyModel company;

    public ProductOwnerModel() {
        super();
        this.setCompany(new CompanyModel());
    }

    public ProductOwnerModel(String name, String nickname, String email, String password, CompanyModel company) {
        super(name, nickname, email, password);
        this.setCompany(company);
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }
}
