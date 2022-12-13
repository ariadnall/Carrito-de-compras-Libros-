package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Departments;


public interface IDepartmentsRepository extends MongoRepository<Departments, String> {

}
