package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Myrepository extends MongoRepository<Banking, String> {


}

