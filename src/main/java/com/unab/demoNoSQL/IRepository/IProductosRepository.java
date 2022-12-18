package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Productos;

public interface IProductosRepository extends MongoRepository<Productos, String>{

}
