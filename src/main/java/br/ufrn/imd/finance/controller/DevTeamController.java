package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.DevTeamModel;
import br.ufrn.imd.finance.model.dto.DevTeamDto;
import br.ufrn.imd.finance.service.DevTeamService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-teams")
public class DevTeamController extends GenericController<DevTeamModel, DevTeamDto> {
    private DevTeamService devTeamService;

    @Override
    protected GenericService<DevTeamModel, DevTeamDto> getService() {
        return this.devTeamService;
    }

    @Autowired
    public void setDevTeamService(DevTeamService devTeamService) {
        this.devTeamService = devTeamService;
    }
}
