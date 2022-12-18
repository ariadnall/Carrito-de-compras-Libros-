package com.unab.demoNoSQL.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("RolesPermisos")
public class RolesPermisos {

    @Id
    private String id;

    @Field("rolId")
    private Integer rolId;

    @Field("permisoId")
    private Integer permisoId;

    @DBRef
    private Roles rolesId;

    @DBRef
    private Permisos permisosId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public Integer getPermisoId() {
		return permisoId;
	}

	public void setPermisoId(Integer permisoId) {
		this.permisoId = permisoId;
	}
    
    

}
