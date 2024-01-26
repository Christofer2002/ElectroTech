import React from 'react'

const ProductRow = ({product}) => {
  console.log(product)
  return (
    <>
      <div className="table-row">
        <div>{product.idProducto}</div>
        <div>{product.nombreProducto}</div>
        <div>{product.descripcionProducto}</div>
        <div>{product.precioProducto}</div>
        <div>{product.cantidadStockProducto}</div>
        {/* Agrega más elementos según las propiedades de tu producto */}
      </div>
    </>
  )
}

export default ProductRow
