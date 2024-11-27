package demoproject.demo1;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.OrderBy;
@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
//	@GetMapping("/products")
//	//@GetMapping
//	
//	public List<Map<String, Object>> getAllProducts(){
//		return Arrays.asList(
//			Map.of("name", "product 1", "price", 234),
//			Map.of("name", "product 2", "price", 134)
//			
//		);
//	}
	@GetMapping("/sortt")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	//@GetMapping("/products/category")
	//@OrderBy("name ASC")
	@OrderBy
	@GetMapping("/category")
	public List<Map<String,Object>> getCategoryProducts(){
		return Arrays.asList(
				Map.of("pavani", "product 1"),
				Map.of("chopricaa", "product 2"),
				Map.of("swathi", "product 3"),
				Map.of("muthu", "product 4"),
				Map.of("sujitha", "product 5"),
				Map.of("harini", "product 6")
				
			);
	}
}
//demo1 productController