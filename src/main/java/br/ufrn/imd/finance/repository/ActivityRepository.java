package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.ActivityModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends GenericRepository<ActivityModel> {

}
