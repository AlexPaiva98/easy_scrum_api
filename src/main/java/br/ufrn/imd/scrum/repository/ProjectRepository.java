package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.scrum.model.ProjectModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends GenericRepository<ProjectModel> {

    List<ProjectModel> findByActiveTrueAndScrumMaster_Person_IdOrTeams_Participants_Developer_Person_IdOrderByNameAsc(Long id, Long id1);
    
}
