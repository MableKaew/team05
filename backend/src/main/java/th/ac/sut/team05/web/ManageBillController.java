package th.ac.sut.team05.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.Bill;
import th.ac.sut.team05.repository.BillRepository;

@RestController
public class ManageBillController {
@Autowired
private BillRepository billRepo;

@RequestMapping("/bill/add")
@ResponseBody
public String addBill(@Valid @RequestBody Bill bill){
	billRepo.save(bill);
	return "Summit Success";
}

@RequestMapping("/bill/delete/{id}")
@ResponseBody
public String deleteBill(@PathVariable("id") Long id){
	billRepo.delete(id);
	return "Deleted";
}

@RequestMapping("/bill/edit/{id}")
@ResponseBody
public String editBill(@PathVariable("id") Long id){
	
	return "Edit Success";
}


}

