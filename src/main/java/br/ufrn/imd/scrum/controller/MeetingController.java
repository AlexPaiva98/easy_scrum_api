package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.MeetingModel;
import br.ufrn.imd.scrum.model.dto.MeetingDto;
import br.ufrn.imd.scrum.service.MeetingService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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

    @GetMapping({"person"})
    public ResponseEntity<Collection<MeetingDto>> findByPerson(@RequestParam("personId") Long personId, @RequestParam("limit") Integer limit, @RequestParam("page") Integer page) throws ValidationException {
        return ResponseEntity.ok(this.meetingService.getMeetingsByPerson(personId, limit, page));
    }

    @GetMapping({"today"})
    public ResponseEntity<Collection<MeetingDto>> findByTodayDate(@RequestParam("personId") Long personId) throws ValidationException {
        return ResponseEntity.ok(this.meetingService.getMeetingsByTodayDate(personId));
    }
}
