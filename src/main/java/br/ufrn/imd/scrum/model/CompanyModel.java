package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.validation.constraints.NotBlank;

@Entity
public class CompanyModel extends AbstractModel {
    @NotBlank
    @Column(unique = true)
    private String cnpj;
    @NotBlank
    private String name;

    public CompanyModel() {
        this.setCnpj("");
        this.setName("");
    }

    public CompanyModel(String cnpj, String name) {
        this.setCnpj(cnpj);
        this.setName(name);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
