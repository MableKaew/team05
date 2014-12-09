package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class User {


	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String userName;
	
	@Column
	private String passWord;
	
	@Column
	private String name;
	@Column
	private String lastname;
	
	@Column
	private String email;
	
	@Column
	private String tel;
	
	@Column(columnDefinition = "ENUM('MALE','FEMALE')")
	private String sex;
	
	
	@Column(columnDefinition = "ENUM('ADMIN','USER')")
	private String level;
	
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String password) {
		this.passWord = password;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
