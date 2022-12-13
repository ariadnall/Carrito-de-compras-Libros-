package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Cities;

public interface ICitiesRepository extends MongoRepository<Cities, String> {

}
