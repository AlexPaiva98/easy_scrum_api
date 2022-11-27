package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.scrum.model.PersonModel;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<PersonModel> {

}
