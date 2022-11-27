package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.scrum.model.DevTeamModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface DevTeamRepository extends GenericRepository<DevTeamModel> {

}
