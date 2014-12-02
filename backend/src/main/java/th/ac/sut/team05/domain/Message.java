package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
<<<<<<< HEAD
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String message;

}
=======
	
@Id
@GeneratedValue
private Long id;

@Column
private String message;

}
>>>>>>> dev
