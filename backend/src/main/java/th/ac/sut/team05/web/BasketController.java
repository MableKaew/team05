package th.ac.sut.team05.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.Product;
import th.ac.sut.team05.domain.basket;
import th.ac.sut.team05.repository.BasketRepository;
import th.ac.sut.team05.repository.ProductRepository;


@RestController
public class BasketController {
@Autowired
private BasketRepository  basketRepo;
@Autowired
private ProductRepository  productRepo;

/*-------------ADMIN MANAGE------------*/
@RequestMapping("/basket/add")
@ResponseBody
public String addBasket(@Valid @RequestBody basket basket){
	basketRepo.save(basket);
	return "�ѹ�֡�����";
}

@RequestMapping("/basket/delete/{id}")
@ResponseBody
public String deleteAdmin(@PathVariable("id") Long id){
	basketRepo.delete(id);
	return "ź�����";
}



@RequestMapping("/saveBasket/{arrProduct}/add")
	@ResponseBody
	public String add(@PathVariable("arrProduct")List<Long> arrProduct, @Valid @RequestBody basket basket){
		basket.setContainProduct(productRepo.findByIdIn(arrProduct));
		basketRepo.save(basket);
		return "Basket Complete";
	}
@RequestMapping("/product/select/{arr}")
@ResponseBody
public List<Product> xxxx(@PathVariable("arr")List<Long> arr){
	return (List<Product>) productRepo.findByIdIn(arr);
}

@RequestMapping("/basket/ShowAll")
@ResponseBody
public List<basket> Showbill(){
	
	return ( List<basket>) basketRepo.findAll();
}

}