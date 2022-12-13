package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Users;

public interface IUsersRepository extends MongoRepository<Users, String>  {

}
