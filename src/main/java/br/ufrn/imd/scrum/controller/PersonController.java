package br.ufrn.imd.scrum.controller;

import br.ufrn.imd.scrum.model.PersonModel;
import br.ufrn.imd.scrum.model.dto.PersonDto;
import br.ufrn.imd.scrum.service.PersonService;
import br.ufrn.imd.springcrud.controller.GenericController;
import br.ufrn.imd.springcrud.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
