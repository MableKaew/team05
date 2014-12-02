package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String message;

}
