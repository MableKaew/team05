package th.ac.sut.team05.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


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

	@Column(columnDefinition = "ENUM('EMS','registered')")
	private String deliveryType;
	@Column
	private int netPrice;
	
	@Column
    private String dateTime;
	
	@OneToOne
	private  Member billmember;

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

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Member getBillmember() {
		return billmember;
	}

	public void setBillmember(Member billmember) {
		this.billmember = billmember;
	}

	
	
	
	
	

}



	