package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.CompanyModel;
import br.ufrn.imd.finance.model.dto.CompanyDto;
import br.ufrn.imd.finance.service.CompanyService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController extends GenericController<CompanyModel, CompanyDto> {
    private CompanyService companyService;

    @Override
    protected GenericService<CompanyModel, CompanyDto> getService() {
        return this.companyService;
    }

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
