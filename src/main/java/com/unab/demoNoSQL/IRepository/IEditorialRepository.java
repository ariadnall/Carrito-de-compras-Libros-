package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Editorial;

public interface IEditorialRepository extends MongoRepository<Editorial, String>{

}
