package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.ProductBacklogModel;
import br.ufrn.imd.scrum.model.dto.ProductBacklogDto;
import br.ufrn.imd.scrum.service.ProductBacklogService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-backlogs")
public class ProductBacklogController extends GenericController<ProductBacklogModel, ProductBacklogDto> {
    private ProductBacklogService productBacklogService;

    @Override
    protected GenericService<ProductBacklogModel, ProductBacklogDto> getService() {
        return this.productBacklogService;
    }

    @Autowired
    public void setProductBacklogService(ProductBacklogService productBacklogService) {
        this.productBacklogService = productBacklogService;
    }
}
