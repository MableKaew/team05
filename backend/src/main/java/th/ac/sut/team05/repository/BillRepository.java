package th.ac.sut.team05.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Bill;
import th.ac.sut.team05.domain.Member;


public interface BillRepository extends CrudRepository<Bill,Long>{
	public List<Bill> findBybillmember (Member member);

}
