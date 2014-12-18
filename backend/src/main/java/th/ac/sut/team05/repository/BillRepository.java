package th.ac.sut.team05.repository;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Bill;

public interface BillRepository extends CrudRepository<Bill,Long>{
	
}
