package com.electrotech.gestion.inventario.service;

import com.electrotech.gestion.inventario.exception.ResourceNotFoundException;
import com.electrotech.gestion.inventario.modelo.Producto;
import com.electrotech.gestion.inventario.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto listarProductoPorId(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: " + id));
    }

    public Producto actualizarProducto(Long id, Producto producto) {
        Producto productoActual = productoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: " + id));

        productoActual.setNombre(producto.getNombre());
        productoActual.setDescripcion(producto.getDescripcion());
        productoActual.setPrecio(producto.getPrecio());
        productoActual.setCantidadStock(producto.getCantidadStock());
        productoActual.setCategoria(producto.getCategoria());
        productoActual.setProveedor(producto.getProveedor());

        return productoRepository.save(productoActual);
    }

    public void eliminarProducto(Long id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: " + id));

        productoRepository.delete(producto);
    }
}
