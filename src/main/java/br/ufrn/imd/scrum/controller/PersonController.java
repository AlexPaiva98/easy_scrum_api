package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.PersonModel;
import br.ufrn.imd.scrum.model.dto.MeetingDto;
import br.ufrn.imd.scrum.model.dto.PersonDto;
import br.ufrn.imd.scrum.service.PersonService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/people")
public class PersonController extends GenericController<PersonModel, PersonDto> {
    private PersonService personService;

    @Override
    protected GenericService<PersonModel, PersonDto> getService() {
        return this.personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping({"login"})
    public ResponseEntity<?> login(@RequestParam("name") String name, @RequestParam("password") String password) throws ValidationException {
        return ResponseEntity.ok(this.personService.login(name, password));
    }

    @PostMapping({"register"})
    public ResponseEntity<?> register(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("email") String email) throws ValidationException {
        return ResponseEntity.ok(this.personService.register(name, password, email));
    }

    @PostMapping({"sendCode"})
    public ResponseEntity<?> sendCode(@RequestParam("email") String email, @RequestParam("code") String code) throws ValidationException {
        this.personService.sendCode(email, code);
        return ResponseEntity.ok(code);
    }

    @PostMapping({"passwordChange"})
    public ResponseEntity<?> passwordChange(@RequestParam("email") String email, @RequestParam("newPassword") String newPassword) throws ValidationException {
        return ResponseEntity.ok(this.personService.passwordChange(email, newPassword));
    }

    @GetMapping({"nickname"})
    public ResponseEntity<PersonDto> findByNickname(@RequestParam("nickname") String nickname) {
        return ResponseEntity.ok(this.personService.findByNickname(nickname));
    }
}
