package com.electrotech.gestion.inventario.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "proveedor")
@PrimaryKeyJoinColumn(name = "proveedor_id_usuario")
public class Proveedor extends Usuario {

    @Column (name = "contacto_proveedor")
    private String contactoProveedor;

    @Column (name = "telefono_proveedor")
    private String telefonoProveedor;

    // Otros campos y métodos necesarios

    // Getters y setters

    public String getContactoProveedor() {
        return contactoProveedor;
    }

    public void setContactoProveedor(String contacto) {
        this.contactoProveedor = contacto;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefono) {
        this.telefonoProveedor = telefono;
    }
}
