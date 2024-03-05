import axios from 'axios';

const PRODUCT_API_BASE_URL = "http://localhost:8080/api/gestion-inventario/";

 class ProductService{
    getAllProducts(){
        return axios.get(PRODUCT_API_BASE_URL + "productos");
    }

    createProduct(product){
        return axios.post(PRODUCT_API_BASE_URL + "productos", product);
    }

    getProductById(productId){
        return axios.get(PRODUCT_API_BASE_URL + "productos/" + productId);
    }

    updateProduct(product, productId){
        return axios.put(PRODUCT_API_BASE_URL + "productos/" + productId, product);
    }

    deleteProduct(productId){
        return axios.delete(PRODUCT_API_BASE_URL + "productos/" + productId);
    }
}

export default new ProductService()