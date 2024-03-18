package com.example.SpringBootEmployeeCrud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootEmployeeCrud.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>
{
	
}
