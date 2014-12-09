package th.ac.sut.team05.repository;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Member;

public interface MemberRepository extends CrudRepository<Member,Long>{
	public Member findOneByUserNameAndPassWord(String userName,String passWord);
	

}
