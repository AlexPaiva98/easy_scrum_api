package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.GuestModel;
import br.ufrn.imd.scrum.model.dto.GuestDto;
import br.ufrn.imd.scrum.service.GuestService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestController extends GenericController<GuestModel, GuestDto> {
    private GuestService guestService;

    @Override
    protected GenericService<GuestModel, GuestDto> getService() {
        return this.guestService;
    }

    @Autowired
    public void setGuestService(GuestService guestService) {
        this.guestService = guestService;
    }
}
