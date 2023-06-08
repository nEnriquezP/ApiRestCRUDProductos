package Api.Rest.CRUD.productos.ApiRest.service;
import Api.Rest.CRUD.productos.ApiRest.entity.Product;
import java.util.List;

public abstract class ProductService {
    public abstract List<Product> fileAll();
    public abstract Product findById(Long id);
    public abstract List<Product> findByName(String nombre);
    public abstract void createProducto(Product product);
    public abstract void modifyProducto(Long id, Product product);
    public abstract void deleteProducto(Long id);

}
