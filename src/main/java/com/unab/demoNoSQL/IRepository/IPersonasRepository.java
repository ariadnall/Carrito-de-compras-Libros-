package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String>{

}
