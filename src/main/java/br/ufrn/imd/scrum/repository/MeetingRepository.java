package br.ufrn.imd.scrum.repository;

import br.ufrn.imd.scrum.model.MeetingModel;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MeetingRepository extends GenericRepository<MeetingModel> {
    List<MeetingModel> findByGuests_Person_IdAndProject_IdAndActiveTrueOrderByDatetimeDesc(Long id, Long id1);

    List<MeetingModel> findByGuests_Person_IdAndActiveTrueAndDatetimeBetweenOrderByDatetimeAsc(Long id, Date datetimeStart, Date datetimeEnd);

    List<MeetingModel> findByGuests_Person_IdAndActiveTrueOrderByDatetimeDesc(Long id, Pageable pageable);
}
