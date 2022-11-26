package br.ufrn.imd.finance.model.dto;

public class ProductOwnerDto extends PersonDto {
    private CompanyDto company;

    public ProductOwnerDto() {
        super();
        this.setCompany(new CompanyDto());
    }

    public ProductOwnerDto(Long id, String name, String nickname, String email, String password, CompanyDto company) {
        super(id, name, nickname, email, password);
        this.setCompany(company);
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }
}
