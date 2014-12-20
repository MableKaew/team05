package th.ac.sut.team05.web;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;








import th.ac.sut.team05.domain.Bill;
import th.ac.sut.team05.domain.Member;
import th.ac.sut.team05.domain.TranferMoney;
import th.ac.sut.team05.repository.MemberRepository;
import th.ac.sut.team05.repository.TranferMoneyRepository;
import th.ac.sut.team05.repository.BillRepository;





@RestController
public class ShowTranferMoneyController {
	@Autowired
	private  TranferMoneyRepository tranferRepo;
	@Autowired
	private  MemberRepository memberRepo;
	@Autowired
	private  BillRepository billRepo;
	
	
	@RequestMapping("show/tranfer/{id}")
	@ResponseBody
	public List<TranferMoney> showByidmember(@PathVariable("id") Long id) {
		return tranferRepo.findByshowmem(memberRepo.findOne(id));
		
	}
	
	
}



