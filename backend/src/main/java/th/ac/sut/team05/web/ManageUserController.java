package th.ac.sut.team05.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.Admin;
import th.ac.sut.team05.domain.Member;
import th.ac.sut.team05.repository.AdminRepository;
import th.ac.sut.team05.repository.MemberRepository;

@RestController
public class ManageUserController {
@Autowired
private AdminRepository  adminRepo;
@Autowired
private MemberRepository memberRepo;
/*-------------ADMIN MANAGE------------*/
@RequestMapping("/admin/add")
@ResponseBody
public String addAdmin(@Valid @RequestBody Admin admin){
	adminRepo.save(admin);
	return "Summit Success";
}

@RequestMapping("/admin/delete/{id}")
@ResponseBody
public String deleteAdmin(@PathVariable("id") Long id){
	adminRepo.delete(id);
	return "ź�����";
}

@RequestMapping("/admin/edit/{id}")
@ResponseBody
public String editAdmin(@PathVariable("id") Long id){
	
	return "Edit Success";
}

/*-------------MEMBER MANAGE------------*/
@RequestMapping("/member/add")
@ResponseBody
public String addMember(@Valid @RequestBody Member member){
	memberRepo.save(member);
	return "�ѹ�֡�����";
}

@RequestMapping("/member/delete/{id}")
@ResponseBody
public String deleteMember(@PathVariable("id") Long id){
	memberRepo.delete(id);
	return "ź�����";
}

@RequestMapping("/member/edit/{id}")
@ResponseBody
public String editMember(@PathVariable("id") Long id){
	
	return "Edit Success";
}


}

