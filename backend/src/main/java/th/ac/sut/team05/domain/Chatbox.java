package th.ac.sut.team05.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Chatbox {
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
