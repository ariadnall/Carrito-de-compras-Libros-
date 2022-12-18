package com.unab.demoNoSQL.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.demoNoSQL.Collection.RolesUsuarios;
import com.unab.demoNoSQL.IRepository.IRolesUsuariosRepository;
import com.unab.demoNoSQL.IService.IRolesUsuariosService;

@Service
public class RolesUsuariosService implements IRolesUsuariosService {

    @Autowired
    private IRolesUsuariosRepository repository;

    @Override
    public List<RolesUsuarios> all(){
        return repository.findAll();
    }

    @Override
    public Optional<RolesUsuarios> findById(String id){
        return repository.findById(id);
    }

    @Override
    public RolesUsuarios save(RolesUsuarios rolesUsuarios){
        return repository.save(rolesUsuarios);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
