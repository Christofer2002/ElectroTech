import React, { useState, useEffect } from 'react'
import SearchBar from './SearchBar.jsx'
import ProductTable from './ProductTable.jsx'
import ProductService from "../../../services/ProductService"


const FilterableProductTable = () => {
  const [products, setProducts] = useState([]);

  const fetchProducts = async () => {
    try {
      // Realiza la llamada al servicio para obtener los productos
      const response = await ProductService.getAllProducts();
      // Actualiza el estado con los productos obtenidos
      setProducts(response.data);
    } catch (error) {
      console.log(error);
    }
  };

  const deleteProduct = (id) => {
    // Filtra la lista de productos eliminando el producto con el ID correspondiente y actualiza el estado
    setProducts(products.filter((product) => product.idProducto !== id));
  };

  useEffect(() => {
    fetchProducts();
  }, []);


  console.log(products);

  return (
    <div>
      <SearchBar />
      <ProductTable
        products={products}
        onDeleteProduct={deleteProduct}
      />
    </div>
  )
}

export default FilterableProductTable
