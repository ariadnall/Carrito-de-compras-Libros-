package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Permisos;

public interface IPermisosRepository extends MongoRepository<Permisos, String>{

}
