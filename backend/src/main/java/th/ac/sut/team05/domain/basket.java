package th.ac.sut.team05.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class basket {

	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String idBasket;
	@Column
	private int amountBuy;

	@Column
	private String datetime;
	
	
	
	@OneToMany
	private Collection<Product> containProduct;
	
	

	public Collection<Product> getContainProduct() {
		return containProduct;
	}

	public void setContainProduct(Collection<Product> containProduct) {
		this.containProduct = containProduct;
	}

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

	public Collection<Product> getHave() {
		return have;
	}

	public void setHave(Collection<Product> have) {
		this.have = have;
	}

	@OneToMany
	private Collection<Product> have;

	}