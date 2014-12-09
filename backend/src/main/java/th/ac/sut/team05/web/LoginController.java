package th.ac.sut.team05.web;

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
public class LoginController {
@Autowired
private AdminRepository adminRepo;
@Autowired
private MemberRepository memberRepo;

@RequestMapping("/user/lgin/{us}/{pw}")
@ResponseBody
public String loginCheck(@PathVariable("us") String userName, @PathVariable("pw") String passWord){
	String result="";
	Admin admin =adminRepo.findOneByUserNameAndPassWord(userName, passWord);
	Member member=memberRepo.findOneByUserNameAndPassWord(userName, passWord);
	if(admin != null){
		result+= admin.getId();
		result+=":";
		result+=admin.getLevel();
	}else if(member != null){
		result+= member.getId();
		result+=":";
		result+=member.getLevel();
	}else{
		result = "null";
		
	}
	
	return result;
}
}
