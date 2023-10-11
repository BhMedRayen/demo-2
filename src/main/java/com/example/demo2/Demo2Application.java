package com.example.demo2;

import com.example.demo2.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo2.repository.ProductRepository;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {SpringApplication.run(Demo2Application.class, args);}
          @Bean
		  CommandLineRunner start(ProductRepository productRepository)
		  {
			return args->{
				productRepository.save(new Product(null,"Computer Desk Top HP",900));
				productRepository.save(new Product(null,"Printer Epson",88));
				productRepository.save(new Product(null,"laptob",2354));
				productRepository.findAll().forEach(System.out::println);
			};
		  };
}

