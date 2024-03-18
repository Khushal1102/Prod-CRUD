package com.example.SpringBootEmployeeCrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootEmployeeCrud.Entity.Product;
import com.example.SpringBootEmployeeCrud.Repo.ProductRepo;

@Service
public class ProductService
{
	@Autowired
	private ProductRepo productrepo;
	
	public List<Product> getAllProducts()
	{
		return productrepo.findAll();
	}
	 public Optional<Product> getProductById(Long id) {
	        return productrepo.findById(id);
	    }
	 
	 public Product createProduct(Product product)
	 {
	        return productrepo.save(product);
	    }
	 public Product updateProduct(Long id, Product updatedProduct) {
	        if (productrepo.existsById(id)) {
	            updatedProduct.setPrice(id);
	            return productrepo.save(updatedProduct);
	        }
	        return null; 
	    }

	    public void deleteProduct(Long id) {
	        productrepo.deleteById(id);
	    }
	
}
