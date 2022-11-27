package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.ProductBacklogModel;
import br.ufrn.imd.scrum.model.dto.ProductBacklogDto;
import br.ufrn.imd.scrum.repository.ProductBacklogRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBacklogService extends GenericService<ProductBacklogModel, ProductBacklogDto> {
    private ProductBacklogRepository productBacklogRepository;

    @Override
    protected GenericRepository<ProductBacklogModel> getRepository() {
        return this.productBacklogRepository;
    }

    @Autowired
    public void setProductBacklogRepository(ProductBacklogRepository productBacklogRepository) {
        this.productBacklogRepository = productBacklogRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, ProductBacklogDto productBacklogDto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check data */
        /** ... */
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
