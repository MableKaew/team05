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
<<<<<<< HEAD
	
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

=======

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
	
	public enum Delivery {EMS,registered}
	
	@Enumerated
	private Delivery deliveryType;
	
	@Column
	private int netPrice;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date dateTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}
	public String getNameReceive() {
		return nameReceive;
	}
	public void setNameReceive(String nameReceive) {
		this.nameReceive = nameReceive;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Delivery getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(Delivery deliveryType) {
		this.deliveryType = deliveryType;
	}
	public int getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}
>>>>>>> dev