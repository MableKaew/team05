package th.ac.sut.team05.repository;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long>{
public Admin findOneByUserNameAndPassWord(String userName,String PassWord);
}
