package com.example.SpringBootEmployeeCrud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootEmployeeCrud.Entity.Product;
import com.example.SpringBootEmployeeCrud.Repo.ProductRepo;
import com.example.SpringBootEmployeeCrud.Service.ProductService;

@RestController


public class ProductController 
{
	@Autowired 
	private ProductService productService;
	
	@GetMapping("/get/Product")
    public List<Product> getAllStudents() {
        return productService.getAllProducts();
    }
	
	@GetMapping("/{id}")
    public Optional<Product> getStudentById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
	
	@PostMapping("/save/Product")
	public Product createProduct(@RequestBody Product product) 
	{
        return productService.createProduct(product);
    }
	
	 @PutMapping("/put/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedStudent) {
	        return productService.updateProduct(id, createProduct(null));
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	    }
	
   

}
