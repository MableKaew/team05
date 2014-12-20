package th.ac.sut.team05.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Bill;
import th.ac.sut.team05.domain.Member;
import th.ac.sut.team05.domain.TranferMoney;

public interface TranferMoneyRepository extends CrudRepository<TranferMoney,Long>{
	
	public TranferMoney findBypayBill (Bill payBill);
	public List<TranferMoney> findByshowmem (Member showmem);
	

}
