package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Persons;

public interface IPersonsRepository extends MongoRepository<Persons, String> {

}
