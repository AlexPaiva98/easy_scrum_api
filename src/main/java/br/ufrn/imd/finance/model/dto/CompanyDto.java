package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class CompanyDto extends AbstractDto {
    private String cnpj;
    private String name;

    public CompanyDto() {
        super();
        this.setCnpj("");
        this.setName("");
    }

    public CompanyDto(Long id, String cnpj, String name) {
        super(id);
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
