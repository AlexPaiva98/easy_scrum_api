package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.UserStorieModel;
import br.ufrn.imd.finance.model.dto.UserStorieDto;
import br.ufrn.imd.finance.service.UserStorieService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-stories")
public class UserStorieController extends GenericController<UserStorieModel, UserStorieDto> {
    private UserStorieService userStorieService;

    @Override
    protected GenericService<UserStorieModel, UserStorieDto> getService() {
        return this.userStorieService;
    }

    @Autowired
    public void setUserStorieService(UserStorieService userStorieService) {
        this.userStorieService = userStorieService;
    }
}
