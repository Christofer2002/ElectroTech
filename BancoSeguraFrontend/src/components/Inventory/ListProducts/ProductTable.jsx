import React from 'react';
import ProductRow from './ProductRow.jsx';

const ProductTable = ({ products, onDeleteProduct }) => {
  return (
    <div className="container">
      <h2 className='text-center'>Inventario General</h2>
      <table className='table table-striped table-hover'>
        <thead>
          <tr>
            <th className="col">ID del Producto</th>
            <th className="col">Producto</th>
            <th className="col">Categoría</th>
            <th className="col">Descripción</th>
            <th className="col">Precio</th>
            <th className="col">Disponible</th>
            <th className="col">Reservado</th>
            <th className="col">Proveedor</th>
            <th className="col">Acciones</th>
          </tr>
        </thead>
        <tbody>
          {products.map((product) => (
            <ProductRow key={product.idProducto} product={product} onDeleteProduct={onDeleteProduct} />
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default ProductTable;