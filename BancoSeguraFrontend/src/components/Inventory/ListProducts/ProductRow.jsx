import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEye, faEdit, faTrash } from '@fortawesome/free-solid-svg-icons';
import ProductService from "../../../services/ProductService"

const ProductRow = ({ product, onDeleteProduct }) => {

  const deleteProduct= async (id) => {
    try {
      // Realiza la llamada al servicio para obtener los productos
      const response = await ProductService.deleteProduct(id);
      // Actualiza el estado con los productos obtenidos
      onDeleteProduct(id);
    } catch (error) {
      console.log(error);
    } 
  };

  return (
    <>
      <tr>
        <td className="col">{product.idProducto}</td>
        <td className="col">{product.nombreProducto}</td>
        <td className="col">{product.categoria.nombreCategoria}</td>
        <td className="col">{product.descripcionProducto}</td>
        <td className="col">{product.precioProducto}</td>
        <td className="col">{product.cantidadStockProducto}</td>
        <td className="col">{product.cantidadReservadoProducto}</td>
        <td className="col">{product.proveedor.nombre}</td>
        <td className="col">
          <FontAwesomeIcon icon={faEye} style={{ color: 'blue', marginRight: '20px', cursor: 'pointer' }} />
          <FontAwesomeIcon icon={faEdit} style={{ color: 'green', marginRight: '20px', cursor: 'pointer' }} />
          <FontAwesomeIcon icon={faTrash} style={{ color: 'red', cursor: 'pointer' }} onClick={() => deleteProduct(product.idProducto)} />
        </td>
      </tr>
    </>
  );
};

export default ProductRow;