package com.unab.demoNoSQL.IService;

import java.util.List;
import java.util.Optional;

import com.unab.demoNoSQL.Collection.Editorial;

public interface IEditorialService {
	public List<Editorial> all();

    public Optional<Editorial> findById(String id);

    public Editorial save(Editorial editorial);

    public void delete(String id);
}
