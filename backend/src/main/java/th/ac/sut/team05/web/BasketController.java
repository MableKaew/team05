package th.ac.sut.team05.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.basket;

import th.ac.sut.team05.repository.BasketRepository;


@RestController
public class BasketController {
@Autowired
private BasketRepository  basketRepo;

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


}