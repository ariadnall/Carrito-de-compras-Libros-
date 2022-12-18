package com.unab.demoNoSQL.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.demoNoSQL.Collection.Editorial;
import com.unab.demoNoSQL.IRepository.IEditorialRepository;
import com.unab.demoNoSQL.IService.IEditorialService;



@Service
public class EditorialService implements IEditorialService {
	@Autowired
    private IEditorialRepository repository;

    @Override
    public List<Editorial> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Editorial> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return repository.save(editorial);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
