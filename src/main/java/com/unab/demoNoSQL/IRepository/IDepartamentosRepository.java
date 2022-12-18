package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Departamentos;

public interface IDepartamentosRepository extends MongoRepository<Departamentos, String> {

}
