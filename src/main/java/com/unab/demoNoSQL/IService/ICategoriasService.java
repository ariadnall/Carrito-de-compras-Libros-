package com.unab.demoNoSQL.IService;

import java.util.List;
import java.util.Optional;

import com.unab.demoNoSQL.Collection.Categorias;

public interface ICategoriasService {
	public List<Categorias> all();

    public Optional<Categorias> findById(String id);

    public Categorias save(Categorias categorias);

    public void delete(String id); 
}
