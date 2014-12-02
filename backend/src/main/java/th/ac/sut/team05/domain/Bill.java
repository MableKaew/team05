package th.ac.sut.team05.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Bill {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String idBill;
	@Column
	private String nameReceive;
	@Column
	private String address;
	@Column
	private String district;
	@Column
	private String province;
	@Column
	private int postCode;
	@Column
	private int tel;
	public enum Delivery { EMS, registered }
	@Enumerated
	private Delivery deliveryType;
	@Column
	private int netPrice;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateTime;

}

