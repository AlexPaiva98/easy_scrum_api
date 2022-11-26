package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.ScrumMasterModel;
import br.ufrn.imd.finance.model.dto.ScrumMasterDto;
import br.ufrn.imd.finance.service.ScrumMasterService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrum-masters")
public class ScrumMasterController extends GenericController<ScrumMasterModel, ScrumMasterDto> {
    private ScrumMasterService scrumMasterService;

    @Override
    protected GenericService<ScrumMasterModel, ScrumMasterDto> getService() {
        return this.scrumMasterService;
    }

    @Autowired
    public void setScrumMasterService(ScrumMasterService scrumMasterService) {
        this.scrumMasterService = scrumMasterService;
    }
}
