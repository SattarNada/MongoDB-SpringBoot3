package com.nada.project.mongodemo.product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository
        extends MongoRepository <Product, String> {


}
