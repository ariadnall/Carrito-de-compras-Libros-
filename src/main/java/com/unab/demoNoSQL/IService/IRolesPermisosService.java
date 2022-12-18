package com.unab.demoNoSQL.IService;

import java.util.List;
import java.util.Optional;

import com.unab.demoNoSQL.Collection.RolesPermisos;

public interface IRolesPermisosService {
	public List<RolesPermisos> all();

	public Optional<RolesPermisos> findById(String id);

	public RolesPermisos save(RolesPermisos rolesPermisos);

	public void delete(String id);

}
