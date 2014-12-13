package th.ac.sut.team05.repository;

import org.springframework.data.repository.CrudRepository;

import th.ac.sut.team05.domain.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{

}
