package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.ParticipantModel;
import br.ufrn.imd.scrum.model.dto.ParticipantDto;
import br.ufrn.imd.scrum.service.ParticipantService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participants")
public class ParticipantController extends GenericController<ParticipantModel, ParticipantDto> {
    private ParticipantService participantService;

    @Override
    protected GenericService<ParticipantModel, ParticipantDto> getService() {
        return this.participantService;
    }

    @Autowired
    public void setParticipantService(ParticipantService participantService) {
        this.participantService = participantService;
    }
}
