package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Ciudades;

public interface ICiudadesRepository extends MongoRepository<Ciudades, String>{

}
