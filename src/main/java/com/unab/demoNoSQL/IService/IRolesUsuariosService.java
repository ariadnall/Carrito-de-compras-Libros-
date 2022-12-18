package com.unab.demoNoSQL.IService;

import java.util.List;
import java.util.Optional;

import com.unab.demoNoSQL.Collection.RolesUsuarios;

public interface IRolesUsuariosService {
	public List<RolesUsuarios> all();

    public Optional<RolesUsuarios> findById(String id);

    public RolesUsuarios save(RolesUsuarios rolesUsuarios);

    public void delete(String id);

}
