package th.ac.sut.team05.web;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




import th.ac.sut.team05.domain.Product;
import th.ac.sut.team05.domain.ProductType;
import th.ac.sut.team05.repository.ProductTypeRepository;
import th.ac.sut.team05.repository.ProductRepository;

@RestController
public class ManageProductTypeController {
@Autowired
private ProductTypeRepository productTypeRepo;
@Autowired
private ProductRepository productRepo;

@RequestMapping("/productType/add")
@ResponseBody
public String addProductType(@Valid @RequestBody ProductType productType){
	productTypeRepo.save(productType);
	return "Summit Success";
}


@RequestMapping("/productType/delete/{id}")
@ResponseBody
public String deleteProductType(@PathVariable("id") Long id){
	productTypeRepo.delete(id);
	return "Deleted";
}

@RequestMapping("/product/add")
@ResponseBody
public String addProduct(@Valid @RequestBody Product product){
	productRepo.save(product);
	return "Summit Success";
}

}
