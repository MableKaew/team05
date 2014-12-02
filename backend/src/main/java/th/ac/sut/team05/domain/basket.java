package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class basket {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdBasket() {
		return idBasket;
	}
	public void setIdBasket(String idBasket) {
		this.idBasket = idBasket;
	}
	public int getAmountBuy() {
		return amountBuy;
	}
	public void setAmountBuy(int amountBuy) {
		this.amountBuy = amountBuy;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String idBasket;
	@Column
	private int amountBuy;
	@Column
	private String datetime;

	}


