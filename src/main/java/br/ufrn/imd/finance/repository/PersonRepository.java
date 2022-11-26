package br.ufrn.imd.finance.repository;

import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.finance.model.PersonModel;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<PersonModel> {

}
