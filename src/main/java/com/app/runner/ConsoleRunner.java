package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
     
	@Autowired
	private ProductRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		repo.save(new Product(10,"AAA",3.2));
		repo.save(new Product(11,"BBB",4.2));
		repo.save(new Product(12,"CCC",5.2));
		repo.save(new Product(13,"DDD",6.2));
		
		System.out.println("..................");
		repo.findAll().forEach(System.out::println);
	}

}
