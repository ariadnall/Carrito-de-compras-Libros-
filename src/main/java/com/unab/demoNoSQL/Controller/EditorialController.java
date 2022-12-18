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

import com.unab.demoNoSQL.Collection.Editorial;
import com.unab.demoNoSQL.IService.IEditorialService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/editorial")
public class EditorialController { 
    
    @Autowired
	private IEditorialService service;
	
	@GetMapping
	public List<Editorial> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Editorial> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Editorial save(@RequestBody Editorial editorial) {
		return service.save(editorial);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Editorial update(@PathVariable String id, @RequestBody Editorial editorial) {
		Optional<Editorial> op = service.findById(id);
    
	if (!op.isEmpty()) {
		Editorial editorialUpdate = op.get();
		editorialUpdate.setCodigo(editorial.getCodigo());
		editorialUpdate.setNombre(editorial.getNombre());
		editorialUpdate.setEstado(editorial.getEstado());
		return service.save(editorialUpdate);
		
     }
	
	return editorial;
   }

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}	
	
