import React, { useState, useEffect } from 'react'
import SearchBar from './SearchBar.jsx'
import ProductTable from './ProductTable.jsx'
import { useFetch } from '../../../hooks/useFetch.js'
import { optionGetFetch } from "/src/constants/index"

const FilterableProductTable = () => {
  const { response, error, fetchData } = useFetch('http://localhost:8080/api/gestion-inventario/productos', optionGetFetch);


  useEffect(() => {
    fetchData();
  }, []); // Llama a fetchData cuando el componente se monta

  if (error) {
    return <div>Error: {error.message}</div>;
  }

  if (!response) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <SearchBar />
      <ProductTable
        products={response}
      />
    </div>
  )
}

export default FilterableProductTable
