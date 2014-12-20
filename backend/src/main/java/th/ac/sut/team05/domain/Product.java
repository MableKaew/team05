package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String idProduct;

	@Column
	private String name;

	@Column
	private int price;

	@Column
	private int amount;

	@Column
	private String detail;

	@Column
	private String picture;

	@Column
	private int discount;

	@Column
	private int normalprice;
	
	@OneToOne
	private ProductType inProductType;
	
	

	public ProductType getInProductType() {
		return inProductType;
	}

	public void setInProductType(ProductType inProductType) {
		this.inProductType = inProductType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getNormalprice() {
		return normalprice;
	}

	public void setNormalprice(int normalprice) {
		this.normalprice = normalprice;
	}
	
	
	
}
