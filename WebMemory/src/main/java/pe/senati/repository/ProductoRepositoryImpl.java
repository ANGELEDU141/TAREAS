package pe.senati.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import pe.senati.entity.Producto;

@Component
public class ProductoRepositoryImpl implements ProductoRepository
{
	public ProductoRepositoryImpl() {}
	
	//tabla virtual
	private static final Map<Integer,Producto> productos=new HashMap<>();
	static
	{
		Producto producto1=new Producto(1021,"Chocolates","Costa",10.99,LocalDate.of(2024,7,10),LocalDate.of(2025,1,12),100);
		Producto producto2=new Producto(1022,"Bombones","Donofrio",14.99,LocalDate.of(2024,8,20),LocalDate.of(2025,2,4),200);
		Producto producto3=new Producto(1023,"Galletas","Rosatel",18.99,LocalDate.of(2024,8,10),LocalDate.of(2024,12,22),150);
		Producto producto4=new Producto(1024,"Caramelos","Arcor",12.99,LocalDate.of(2024,4,13),LocalDate.of(2025,5,10),250);
		
		productos.put(producto1.getProducto_id(),producto1);
		productos.put(producto2.getProducto_id(),producto2);
		productos.put(producto3.getProducto_id(),producto3);
		productos.put(producto4.getProducto_id(),producto4);
	}
	
	@Override
	public void insert(Producto producto) 
	{
		Integer newID=productos.size()+1021;
		producto.setProducto_id(newID);
		
		productos.put(producto.getProducto_id(),producto);
	}

	@Override
	public void update(Producto producto) {
		productos.put(producto.getProducto_id(),producto);	
	}

	@Override
	public void delete(Integer producto_id) {
		productos.remove(producto_id);	
	}

	@Override
	public Producto findById(Integer producto_id) {
		return productos.get(producto_id);
	}

	@Override
	public Collection<Producto> findAll() {
		return productos.values();
	}
	

	@Override
	public void deleteAll() {
	    productos.clear();
	}
}

