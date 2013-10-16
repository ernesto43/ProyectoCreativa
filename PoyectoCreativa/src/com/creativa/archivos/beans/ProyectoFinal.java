package com.creativa.archivos.beans;

public class ProyectoFinal {
	String nombreProducto;
	String precioProducto;
	String cantidadProducto;
	
	public ProyectoFinal(){}
	
	public ProyectoFinal(String nombreProducto, String precioProducto, String cantidadProducto){
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	

}
