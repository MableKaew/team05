package th.ac.sut.team05.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProductType {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String idType;
	
	@Column 
	private String name;
	
	@OneToMany
	private Product have;
	
	

	public Product getHave() {
		return have;
	}

	public void setHave(Product have) {
		this.have = have;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
