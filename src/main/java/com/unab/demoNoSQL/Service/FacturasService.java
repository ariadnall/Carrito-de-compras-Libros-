package com.unab.demoNoSQL.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.demoNoSQL.Collection.Facturas;
import com.unab.demoNoSQL.IRepository.IFacturasRepository;
import com.unab.demoNoSQL.IService.IFacturasService;

@Service
public class FacturasService implements IFacturasService {
	   @Autowired
	    private IFacturasRepository repository;

	    @Override
	    public List<Facturas> all() {
	        return repository.findAll();
	    }

	    @Override
	    public Optional<Facturas> findById(String id) {
	        return repository.findById(id);
	    }

	    @Override
	    public Facturas save(Facturas facturas) {
	        return repository.save(facturas);
	    }

	    @Override
	    public void delete(String id) {
	        repository.deleteById(id);
	    }
}
