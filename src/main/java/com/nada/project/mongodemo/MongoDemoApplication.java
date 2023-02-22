package com.nada.project.mongodemo;

import com.nada.project.mongodemo.category.Category;
import com.nada.project.mongodemo.category.CategoryRepository;
import com.nada.project.mongodemo.product.Product;
import com.nada.project.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
		ProductRepository repository,
		CategoryRepository categoryRepository
	)  {
		return args -> {
			var category = Category.builder()
					.name("makeup")
					.description("marque maybeline")
					.build();

			var category1 = Category.builder()
					.name("cat1")
					.description("details cat1")
					.build();

			categoryRepository.insert(category);
			categoryRepository.insert(category1);
			var product= Product.builder()
					.name("iphone")
					.description("phone iphone")
					.build();
			repository.insert(product);
		};
	}
}
