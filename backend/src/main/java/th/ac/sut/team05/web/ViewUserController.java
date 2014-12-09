package th.ac.sut.team05.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.Admin;
import th.ac.sut.team05.domain.Member;
import th.ac.sut.team05.repository.AdminRepository;
import th.ac.sut.team05.repository.MemberRepository;

@RestController
public class ViewUserController {
@Autowired
private MemberRepository memberRepo;
@Autowired
private AdminRepository adminRepo;

@RequestMapping("/member/show/{id}")
@ResponseBody
public Member showMemberById(@PathVariable("id") Long id){
	return memberRepo.findOne(id);
}

@RequestMapping("/admin/show/{id}")
@ResponseBody
public Admin showAdminById(@PathVariable("id") Long id){
	return adminRepo.findOne(id);
}

@RequestMapping("/user/showall")
@ResponseBody
@SuppressWarnings({"unchecked","rawtypes"})
public ArrayList showUserAll(){
	ArrayList user =new ArrayList();
	List<Member> listMember =(List<Member>)memberRepo.findAll();
	List<Admin> listAdmin = (List<Admin>)adminRepo.findAll();
	for(Member member : listMember)
		user.add(member);
	for(Admin admin : listAdmin)
		user.add(admin);
	return user;
	
}
}
