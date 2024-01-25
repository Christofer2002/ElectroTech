package com.electrotech.gestion.inventario.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name = "tipo_usuario")
public enum TipoUsuario {
    EMPLEADO,
    PROVEEDOR
}
