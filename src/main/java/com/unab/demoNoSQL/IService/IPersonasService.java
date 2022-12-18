package com.unab.demoNoSQL.IService;

import java.util.List;
import java.util.Optional;

import com.unab.demoNoSQL.Collection.Personas;

public interface IPersonasService {
public List<Personas> all();
    
	public Optional<Personas> findById(String id);
	    
	public Personas save(Personas personas);
	    
	public void delete(String id);
}
