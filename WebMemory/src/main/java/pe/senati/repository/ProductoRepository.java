package pe.senati.repository;

import java.util.Collection;

import pe.senati.entity.Producto;

public interface ProductoRepository {
    public abstract void insert(Producto producto);
    public abstract void update(Producto producto);
    public abstract void delete(Integer producto_id); // Nuevo método
    public abstract void deleteAll(); // Nuevo método
    public abstract Producto findById(Integer producto_id);
    public abstract Collection<Producto> findAll();
}
