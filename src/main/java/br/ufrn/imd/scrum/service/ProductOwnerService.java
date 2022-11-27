package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.ProductOwnerModel;
import br.ufrn.imd.scrum.model.dto.ProductOwnerDto;
import br.ufrn.imd.scrum.repository.ProductOwnerRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOwnerService extends GenericService<ProductOwnerModel, ProductOwnerDto> {
    private ProductOwnerRepository productOwnerRepository;

    @Override
    protected GenericRepository<ProductOwnerModel> getRepository() {
        return this.productOwnerRepository;
    }

    @Autowired
    public void setProductOwnerRepository(ProductOwnerRepository productOwnerRepository) {
        this.productOwnerRepository = productOwnerRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ProductOwnerDto productOwnerDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
