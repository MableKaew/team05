package th.ac.sut.team05.web;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




import th.ac.sut.team05.domain.TranferMoney;
import th.ac.sut.team05.repository.MemberRepository;
import th.ac.sut.team05.repository.TranferMoneyRepository;
import th.ac.sut.team05.repository.BillRepository;





@RestController
public class TranferMoneyController {

	
	@Autowired
	private  TranferMoneyRepository tranferRepo;
	@Autowired
	private  BillRepository billRepo;
	@Autowired
	private  MemberRepository memRepo;
		
	@RequestMapping("/TranferMoney/billid/{id}/{idmem}/add")
	@ResponseBody
	public String addtrafer(@PathVariable("id") Long id, @Valid @RequestBody TranferMoney tranferMoney, @PathVariable("idmem") Long  idmem) {
		
		
		tranferMoney.setShowmem(memRepo.findOne(idmem));
		tranferMoney.setPayBill(billRepo.findOne(id));
		tranferRepo.save(tranferMoney);
		
		
		
		
		return "บันทึกสำเร็จแล้วค่ะ";
	}
	
	
}


