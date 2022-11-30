package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.scrum.model.MeetingModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.scrum.model.PersonModel;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends GenericRepository<PersonModel> {
    public PersonModel findByNickname(String username);

    public PersonModel findByEmail(String username);
}
