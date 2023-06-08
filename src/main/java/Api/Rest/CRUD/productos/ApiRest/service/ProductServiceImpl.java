package Api.Rest.CRUD.productos.ApiRest.service;

import Api.Rest.CRUD.productos.ApiRest.dao.ProductDao;
import Api.Rest.CRUD.productos.ApiRest.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;


    @Override
    public List<Product> fileAll() {
        return (List<Product>)productDao.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String nombre) {
        return productDao.findByName(nombre);
    }

    @Override
    public void createProducto(Product product) {
      productDao.save(product);
    }

    @Override
    public void modifyProducto(Long id, Product product) {
        if(productDao.existsById(id)){
            product.setId(id);
            productDao.save(product);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        if(productDao.existsById(id)){
            productDao.deleteById(id);
        }
    }
}
