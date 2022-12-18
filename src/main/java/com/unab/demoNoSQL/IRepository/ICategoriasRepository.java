package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Categorias;

public interface ICategoriasRepository extends MongoRepository<Categorias, String> {

}
