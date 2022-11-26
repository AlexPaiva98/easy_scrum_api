package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.ProductOwnerModel;
import br.ufrn.imd.finance.model.dto.ProductOwnerDto;
import br.ufrn.imd.finance.service.ProductOwnerService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-owners")
public class ProductOwnerController extends GenericController<ProductOwnerModel, ProductOwnerDto> {
    private ProductOwnerService productOwnerService;

    @Override
    protected GenericService<ProductOwnerModel, ProductOwnerDto> getService() {
        return this.productOwnerService;
    }

    @Autowired
    public void setProductOwnerService(ProductOwnerService productOwnerService) {
        this.productOwnerService = productOwnerService;
    }
}
