package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class User {


	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String userName;
	
	@Column
	private String passWord;
	
	@Column(columnDefinition = "ENUM('MALE','FEMALE')")
	private String sex;
	
	@Column
	private String name;
	@Column
	private String lastname;
	
	@Column
	private String email;
	
	@Column
	private String tel;
	
	
	
	@Column(columnDefinition = "ENUM('ADMIN','USER')")
	private String level;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
	
	
	
}
