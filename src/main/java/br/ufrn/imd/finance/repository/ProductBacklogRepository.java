package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.ProductBacklogModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductBacklogRepository extends GenericRepository<ProductBacklogModel> {

}
