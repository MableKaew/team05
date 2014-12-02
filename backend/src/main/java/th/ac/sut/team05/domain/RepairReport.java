package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RepairReport {
	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 20)
	private String idRp;

	@Column(length = 144)
	private String detail;

	@Column(length = 144)
	private String billCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdRp() {
		return idRp;
	}

	public void setIdRp(String idRp) {
		this.idRp = idRp;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

}