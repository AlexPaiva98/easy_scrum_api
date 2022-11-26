package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.GuestModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends GenericRepository<GuestModel> {

}
