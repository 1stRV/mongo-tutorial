package com.example.demo.repository;

import com.example.demo.model.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionRepository extends MongoRepository<Action, String> { }
