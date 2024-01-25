package com.electrotech.gestion.inventario.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion_producto")
    private String descripcionProducto;

    @Column(name = "precio_producto")
    private double precioProducto;

    @Column(name = "cantidad_stock_producto")
    private int cantidadStockProducto;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Getters y setters
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public String getDescripcion() {
        return descripcionProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcionProducto = descripcion;
    }

    public Double getPrecio() {
        return precioProducto;
    }

    public void setPrecio(Double precio) {
        this.precioProducto = precio;
    }

    public Integer getCantidadStock() {
        return cantidadStockProducto;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStockProducto = cantidadStock;
    }
}
