package demoproject.demo1;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public List<Product> getAllProducts(){
		return productRepository.findAll(Sort.by(Sort.Order.asc("name")));
	}

}
//demo1 productservice