package th.ac.sut.team05.repository;

import org.springframework.data.repository.CrudRepository;



import th.ac.sut.team05.domain.Product;
import th.ac.sut.team05.domain.basket;

public interface BasketRepository extends CrudRepository<basket,Long>{
	
	public basket findByContainProduct(Product product);

}
