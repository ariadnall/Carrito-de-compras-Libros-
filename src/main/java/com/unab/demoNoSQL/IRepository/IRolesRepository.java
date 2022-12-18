package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Roles;

public interface IRolesRepository extends MongoRepository<Roles, String>  {

}
