package th.ac.sut.team05.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TranferMoney {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String date;
	
	@Column
	private int balance;
	@Column
	private String picture;
	@Column
	private String name;
	@Column
	private String lastname;
	@OneToOne
	private  Bill payBill;
	@OneToOne
	private  Member showmem;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Bill getPayBill() {
		return payBill;
	}
	public void setPayBill(Bill payBill) {
		this.payBill = payBill;
	}
	public Member getShowmem() {
		return showmem;
	}
	public void setShowmem(Member showmem) {
		this.showmem = showmem;
	}
	
	
	
	
}
