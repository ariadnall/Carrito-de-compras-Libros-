package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.RolesPermisos;

public interface IRolesPermisosRepository extends MongoRepository<RolesPermisos, String> {

}
