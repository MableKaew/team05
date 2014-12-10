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


}
