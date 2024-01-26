import React from 'react'
import ProductRow from './ProductRow.jsx'

const ProductTable = (products) => {
  console.log(products)
  return (
    <div>
      <div className="table-header">
        <div>Id</div>
        <div>Nombre</div>
        <div>Descripción</div>
        <div>Precio</div>
        <div>Cantidad en Stock</div>
        {/* Agrega más encabezados según las propiedades de tu producto */}
      </div>
      {products.products.map(product => (
        <ProductRow key={product.idProducto} product={product} />
      ))}
    </div>
  );
}

export default ProductTable
