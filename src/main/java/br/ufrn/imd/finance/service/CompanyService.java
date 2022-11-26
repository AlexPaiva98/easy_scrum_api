package br.ufrn.imd.finance.service;

import br.ufrn.imd.finance.model.CompanyModel;
import br.ufrn.imd.finance.model.dto.CompanyDto;
import br.ufrn.imd.finance.repository.CompanyRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends GenericService<CompanyModel, CompanyDto> {
    private CompanyRepository companyRepository;

    @Override
    protected GenericRepository<CompanyModel> getRepository() {
        return this.companyRepository;
    }

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, CompanyDto companyDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
