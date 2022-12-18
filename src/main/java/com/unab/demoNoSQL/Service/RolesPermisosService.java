package com.unab.demoNoSQL.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.demoNoSQL.Collection.RolesPermisos;
import com.unab.demoNoSQL.IRepository.IRolesPermisosRepository;
import com.unab.demoNoSQL.IService.IRolesPermisosService;

@Service
public class RolesPermisosService implements IRolesPermisosService {

    @Autowired
    private IRolesPermisosRepository repository;

    @Override
    public List<RolesPermisos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<RolesPermisos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public RolesPermisos save(RolesPermisos rolesPermisos){
        return repository.save(rolesPermisos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
