package com.unab.demoNoSQL.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Facturas")
public class Facturas {
	@Id
    private String id;
	 @Field("codigoFactura")
	    private String codigoFactura;

    @Field("fechaFactura")
    private String fechaFactura;

    @Field("valorBruto")
    private String valorBruto;

    @Field("valorDescuento")
    private String valorDescuento;

    @Field("valorIva")
    private String valorIva;

    @Field("valorNeto")
    private String valorNeto;


    @DBRef
    private Usuarios usuariosId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}



    public String getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(String valorBruto) {
		this.valorBruto = valorBruto;
	}

	

    public String getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(String valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	

  

	public String getValorIva() {
		return valorIva;
	}

	public void setValorIva(String valorIva) {
		this.valorIva = valorIva;
	}

	public String getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(String valorNeto) {
		this.valorNeto = valorNeto;
	}

	public Usuarios getUsuariosId() {
		return usuariosId;
	}

	public void setUsuariosId(Usuarios usuariosId) {
		this.usuariosId = usuariosId;
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}


  
}
