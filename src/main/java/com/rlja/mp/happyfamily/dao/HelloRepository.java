package com.rlja.mp.happyfamily.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HelloRepository extends MongoRepository<HelloEntity, Integer> {


    Optional<HelloEntity> findByName(String name);
}
