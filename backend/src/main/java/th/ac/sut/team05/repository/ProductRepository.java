package th.ac.sut.team05.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Product;
import th.ac.sut.team05.domain.ProductType;

public interface ProductRepository extends CrudRepository<Product,Long>{

	public List<Product> findByIdIn(List<Long> arr);
	
	//onetoone กับ  product Type
	
	public List<Product> findByinProductType(ProductType productType);
	
}
