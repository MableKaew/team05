package th.ac.sut.team05.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.sut.team05.domain.Product;
import th.ac.sut.team05.domain.ProductType;
import th.ac.sut.team05.repository.ProductRepository;
import th.ac.sut.team05.repository.ProductTypeRepository;

@RestController
public class ViewProductController {
   @Autowired
   private ProductTypeRepository productTypeRepo;
   @Autowired
   private ProductRepository productRepo;
   
   @RequestMapping("/productType/showall")
   @ResponseBody
   public List<ProductType> showProductTypeAll(){
	   return (List<ProductType>) productTypeRepo.findAll();
   }
   
   //ไม่ได้ใช้
   @RequestMapping("/productype/show1/{id}")
   @ResponseBody
   public ProductType showProductTypeId1(@PathVariable("id") Long id){
	   return productTypeRepo.findOne(id);
   }
   //แก้ไขค้นหา product โดย productType
   @RequestMapping("/productype/show/{id}")
   @ResponseBody
   public List<Product> showProductTypeId(@PathVariable("id") Long id){
	   return productRepo.findByinProductType(productTypeRepo.findOne(id));
   }
   
   @RequestMapping("/product/show/{id}")
   @ResponseBody
   public Product showProductId(@PathVariable("id") Long id){
	   return productRepo.findOne(id);
   }
   @RequestMapping("/product/showall")
   @ResponseBody
   public List<Product> AllshowProduct(){
	   return (List<Product>) productRepo.findAll();
   }
   
}
