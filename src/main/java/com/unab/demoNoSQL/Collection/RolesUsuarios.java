package com.unab.demoNoSQL.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("RolesUsuarios")
public class RolesUsuarios {

    @Id
    private String id;

    @Field("usuarioId")
    private Integer usuarioId;

    @Field("rolId")
    private Integer rolId;

    @DBRef
    private Usuarios usuariosId;

    @DBRef
    private Roles rolesId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	

	
    
    

}
