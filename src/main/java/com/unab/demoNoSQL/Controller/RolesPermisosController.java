package com.unab.demoNoSQL.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.demoNoSQL.Collection.RolesPermisos;
import com.unab.demoNoSQL.IService.IRolesPermisosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/rolesPermisos")
public class RolesPermisosController {

    @Autowired
    private IRolesPermisosService service;

    @GetMapping
    public List<RolesPermisos> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<RolesPermisos> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesPermisos save(@RequestBody RolesPermisos rolesPermisos) {
        return service.save(rolesPermisos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesPermisos update(@PathVariable String id, @RequestBody RolesPermisos rolesPermisos) {
        Optional<RolesPermisos> op = service.findById(id);

        if (!op.isEmpty()) {
            RolesPermisos RolesPermisosUpdate = op.get();
            RolesPermisosUpdate.setPermisoId(rolesPermisos.getPermisoId());
			RolesPermisosUpdate.setRolId(rolesPermisos.getRolId());
            return service.save(RolesPermisosUpdate);
        }

        return rolesPermisos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
