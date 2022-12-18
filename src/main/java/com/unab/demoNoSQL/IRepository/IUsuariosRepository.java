package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String>{

}
