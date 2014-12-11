package th.ac.sut.team05.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Member extends User{
	
	@Column
	private String memberId;

	@OneToMany
 	private Collection<basket> order;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Collection<basket> getOrder() {
		return order;
	}

	public void setOrder(Collection<basket> order) {
		this.order = order;
	}


}
