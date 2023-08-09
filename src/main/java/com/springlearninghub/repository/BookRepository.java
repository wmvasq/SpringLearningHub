package com.springlearninghub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springlearninghub.model.Book;

public interface  BookRepository extends MongoRepository<Book,Integer> {
    
}
