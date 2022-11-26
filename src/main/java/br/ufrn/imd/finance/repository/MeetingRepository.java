package br.ufrn.imd.finance.repository;

import br.ufrn.imd.finance.model.MeetingModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends GenericRepository<MeetingModel> {

}
