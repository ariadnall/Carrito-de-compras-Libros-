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

import com.unab.demoNoSQL.Collection.Facturas;
import com.unab.demoNoSQL.IService.IFacturasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/facturas")
public class FacturasController {

	@Autowired
	private IFacturasService service;
	
	@GetMapping
	public List<Facturas> all() {
		return service.all();
	}
	

	@GetMapping("{id}")
	public Optional<Facturas> show(@PathVariable String id) {
		return service.findById(id);
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Facturas save(@RequestBody Facturas facturas) {
		return service.save(facturas);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Facturas update(@PathVariable String id, @RequestBody Facturas facturas) {
		Optional<Facturas> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Facturas facturasUpdate = op.get();
			facturasUpdate.setCodigoFactura(facturas.getCodigoFactura());
			facturasUpdate.setFechaFactura(facturas.getFechaFactura());
			facturasUpdate.setValorBruto(facturas.getValorBruto());
			facturasUpdate.setValorDescuento(facturas.getValorDescuento());
			facturasUpdate.setValorIva(facturas.getValorIva());
			facturasUpdate.setValorNeto(facturas.getValorNeto());
			facturasUpdate.setUsuariosId(facturas.getUsuariosId());
			return service.save(facturasUpdate);
		}
		
		return facturas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
