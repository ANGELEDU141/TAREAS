package pe.senati.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Producto 
{
	private Integer producto_id;
	private String nombre;
	private String marca;
	private Double precio;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate ffabricacion;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fvencimiento;
	
	private Integer stock;
	
	public Producto() {}

	public Producto(Integer producto_id, String nombre, String marca, Double precio, LocalDate ffabricacion,
			LocalDate fvencimiento, Integer stock) {
		this.producto_id = producto_id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.ffabricacion = ffabricacion;
		this.fvencimiento = fvencimiento;
		this.stock = stock;
	}

	public Integer getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Integer producto_id) {
		this.producto_id = producto_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFfabricacion() {
		return ffabricacion;
	}

	public void setFfabricacion(LocalDate ffabricacion) {
		this.ffabricacion = ffabricacion;
	}

	public LocalDate getFvencimiento() {
		return fvencimiento;
	}

	public void setFvencimiento(LocalDate fvencimiento) {
		this.fvencimiento = fvencimiento;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
