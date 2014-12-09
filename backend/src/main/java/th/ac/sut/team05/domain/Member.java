package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Member extends User{
	
	@Column
	private String memberId;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	

}
