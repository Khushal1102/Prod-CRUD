package com.example.SpringBootEmployeeCrud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	
	private String pname;
	private String brand;
	private double price;
	private String madeIn;
}
