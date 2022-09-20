package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.exception.ProductException;

@RestController
public class ProductController {

	
	@GetMapping("/products")
	public List<Product> getProducts() {
		
		List<Product> list = new ArrayList<>();
		
		list.add( new Product(1,"Mobile",15000.0,"Nokia","Electronics",121254789,"Nokia123"));
		list.add( new Product(2,"Earphones",1299.99,"Apple","Electronics",253482,"Apple123"));
		list.add( new Product(3,"Speakers",8999.99,"Boat","Electronics",2589632,"Boat123"));
		list.add( new Product(4,"Grass Cutter",25000.0,"Makita","Tools",54689,"M253"));
		list.add( new Product(5,"Pan",1200.0,"Prestage","Kitchen",2546,"Per123"));
		
		return list;
		
	}
	
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") int i) {
		
		if(i<=0) {
			throw new ProductException("Product Id Should be Greater than Zero");
		}
		
		return new Product(i,"Mobile",10000.0,"Nokia","Mobiles",121254789,"ABC123");
		
	}
	
	
	@PostMapping(value="/product",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String setProduct(@RequestBody Product pro) {
			
		return "Sucessfully Added " + pro;
	}
	
	
	
	@PutMapping("/product/{id}")
	public String updateProductById(@RequestBody Product pro, @PathVariable("id") int i) {
		
		
		if(i<=0) {
			throw new ProductException("Product Id Should be Greater than Zero");
		}
		
		pro.setId(i);
		return "Sucessfully Updated " + pro;
		
	}
	
	
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@RequestBody Product pro, @PathVariable("id") int i) {
		
		if(i<=0) {
			throw new ProductException("Product Id Should be Greater than Zero");
		}
		
		return "Sucessfully Deleted " + pro;
		
	}
	
}
