package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.ProjectModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends GenericRepository<ProjectModel> {

}
