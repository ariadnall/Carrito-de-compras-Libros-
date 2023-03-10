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

import com.unab.demoNoSQL.Collection.Permisos;
import com.unab.demoNoSQL.IService.IPermisosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/permisos")
public class PermisosController {

    @Autowired
    private IPermisosService service;

    @GetMapping
    public List<Permisos> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Permisos> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Permisos save(@RequestBody Permisos permisos) {
        return service.save(permisos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Permisos update(@PathVariable String id, @RequestBody Permisos permisos) {
        Optional<Permisos> op = service.findById(id);

        if (!op.isEmpty()) {
            Permisos PermisosUpdate = op.get();
            PermisosUpdate.setCodigo(permisos.getCodigo());
            PermisosUpdate.setNombre(permisos.getNombre());
            PermisosUpdate.setRuta(permisos.getRuta());
            PermisosUpdate.setEstado(permisos.getEstado());
            return service.save(PermisosUpdate);
        }

        return permisos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
