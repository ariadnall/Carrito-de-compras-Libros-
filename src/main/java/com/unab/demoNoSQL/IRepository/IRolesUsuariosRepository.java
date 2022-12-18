package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.RolesUsuarios;

public interface IRolesUsuariosRepository extends MongoRepository<RolesUsuarios, String> {

}
