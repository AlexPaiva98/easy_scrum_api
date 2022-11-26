package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.UserStorieModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserStorieRepository extends GenericRepository<UserStorieModel> {

}
