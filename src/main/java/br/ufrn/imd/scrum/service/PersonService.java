package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.PersonModel;
import br.ufrn.imd.scrum.model.dto.PersonDto;
import br.ufrn.imd.scrum.repository.PersonRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<PersonModel, PersonDto> {
    private PersonRepository personRepository;

    @Override
    protected GenericRepository<PersonModel> getRepository() {
        return this.personRepository;
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, PersonDto dto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check name */
        if (dto.getName().isEmpty()) {
            exceptionHelper.add("invalid name");
        }
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
