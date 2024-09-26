package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Producto;
import pe.senati.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController 
{
	@Autowired
	@Qualifier("productoServiceImpl")
	private ProductoService productoService;
	
	public ProductoController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		//llave-valor
		map.put("bProductos",productoService.findAll());
		
		return "Producto/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		//entidad NULL
		Producto productoModel=new Producto();
		
		//modelo llave-valor
		model.addAttribute("producto",productoModel);
		
		return "Producto/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Producto producto)
	{
		//entidad LOAD
		//insertar a la BD
		productoService.insert(producto);
		
		//mostrar productos
		return "redirect:/producto/listar";
	}
	
	@GetMapping("/editar/{producto_id}")
	public String editar_GET(Model model,@PathVariable Integer producto_id)
	{
		//entidad buscada por ID
		Producto productoDb=productoService.findById(producto_id);
		
		//entidad LOAD
		model.addAttribute("producto",productoDb);
		
		return "Producto/editar";
	}
	
	@PostMapping("/editar/{producto_id}")
	public String editar_POST(Producto producto)
	{
		//entidad UPDATE
		productoService.update(producto);
		
		//mostrar productos
		return "redirect:/producto/listar";
	}
	
	@GetMapping("/detalle/{producto_id}")
	public String detalle_GET(Model model, @PathVariable Integer producto_id) {
	    // Entidad buscada por ID
	    Producto productoDb = productoService.findById(producto_id);

	    // Entidad LOAD
	    model.addAttribute("producto", productoDb);

	    return "Producto/detalle";
	}
	
	
	
	
	@GetMapping("/borrar/{producto_id}")
	public String borrar_GET(Model model, @PathVariable Integer producto_id) {
	    // Entidad buscada por ID
	    Producto productoDb = productoService.findById(producto_id);

	    // Entidad LOAD
	    model.addAttribute("producto", productoDb);

	    return "Producto/borrar";
	}
	

	@PostMapping("/borrar/{producto_id}")
	public String borrar_POST(@PathVariable Integer producto_id) {
	    // Entidad DELETE
	    productoService.delete(producto_id);

	    // Mostrar productos
	    return "redirect:/producto/listar";
	}
	
}
