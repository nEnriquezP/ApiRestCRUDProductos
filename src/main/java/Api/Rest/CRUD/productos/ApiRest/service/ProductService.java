package Api.Rest.CRUD.productos.ApiRest.service;
import Api.Rest.CRUD.productos.ApiRest.entity.Product;
import java.util.List;

public interface ProductService {
    public List<Product> fileAll();
    public Product findById(Long id);
    public List<Product> findByName(String name);
    public void createProducto(Product product);
    public void modifyProducto(Long id, Product product);
    public void deleteProducto(Long id);

}
