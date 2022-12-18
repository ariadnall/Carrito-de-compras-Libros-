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

import com.unab.demoNoSQL.Collection.RolesUsuarios;
import com.unab.demoNoSQL.IService.IRolesUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles_usuarios")
public class RolesUsuariosController {

    @Autowired
    private IRolesUsuariosService service;

    @GetMapping
    public List<RolesUsuarios> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<RolesUsuarios> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesUsuarios save(@RequestBody RolesUsuarios rolesUsuarios) {
        return service.save(rolesUsuarios);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesUsuarios update(@PathVariable String id, @RequestBody RolesUsuarios rolesUsuarios) {
        Optional<RolesUsuarios> op = service.findById(id);

        if (!op.isEmpty()) {
            RolesUsuarios RolesUsuariosUpdate = op.get();
            RolesUsuariosUpdate.setUsuarioId(rolesUsuarios.getUsuarioId());
            RolesUsuariosUpdate.setRolId(rolesUsuarios.getRolId());
            return service.save(RolesUsuariosUpdate);
        }

        return rolesUsuarios;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
