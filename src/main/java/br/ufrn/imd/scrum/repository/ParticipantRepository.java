package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.scrum.model.ParticipantModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends GenericRepository<ParticipantModel> {

}
