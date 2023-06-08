package Api.Rest.CRUD.productos.ApiRest.dao;

import Api.Rest.CRUD.productos.ApiRest.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}
