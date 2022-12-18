package com.unab.demoNoSQL.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.demoNoSQL.Collection.Facturas;

public interface IFacturasRepository extends MongoRepository<Facturas, String> {

}
