package com.assignment.evamp.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.assignment.evamp.product.domain.Product;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{name:'?0'}")
    Product findItemByName(String name);

    @Query(value="{type:'?0'}")
    List<Product> findByType(String type);


}
