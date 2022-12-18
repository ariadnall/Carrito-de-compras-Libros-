package com.unab.demoNoSQL.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.demoNoSQL.Collection.Usuarios;
import com.unab.demoNoSQL.IRepository.IUsuariosRepository;
import com.unab.demoNoSQL.IService.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{
	
	@Autowired
	private IUsuariosRepository repository; 
	
	@Override
	public List<Usuarios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {		
		return repository.save(usuarios);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}
} 
