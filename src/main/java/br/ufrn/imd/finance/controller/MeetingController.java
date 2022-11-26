package br.ufrn.imd.finance.controller;

import br.ufrn.imd.finance.model.MeetingModel;
import br.ufrn.imd.finance.model.dto.MeetingDto;
import br.ufrn.imd.finance.service.MeetingService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meetings")
public class MeetingController extends GenericController<MeetingModel, MeetingDto> {
    private MeetingService meetingService;

    @Override
    protected GenericService<MeetingModel, MeetingDto> getService() {
        return this.meetingService;
    }

    @Autowired
    public void setMeetingService(MeetingService meetingService) {
        this.meetingService = meetingService;
    }
}
