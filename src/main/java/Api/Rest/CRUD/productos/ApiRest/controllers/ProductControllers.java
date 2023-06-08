package Api.Rest.CRUD.productos.ApiRest.controllers;

import Api.Rest.CRUD.productos.ApiRest.entity.Product;
import Api.Rest.CRUD.productos.ApiRest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductControllers {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> listarProducto(){
        return productService.fileAll()
    }

    @GetMapping(value = "/{id}")
    public Product obtenerProducto(@RequestParam Long id){
        return productService.findById(id);
    }

    @PostMapping()
    public void crearProducto(@RequestBody Product product){
        productService.createProducto(product);
    }

    @PutMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id, @RequestBody Product product){
        productService.modifyProducto(id, product);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarProduct(@PathVariable Long id){
        productService.deleteProducto(id);
    }

    @GetMapping(value = "/{nombre}")
    public List<Product> buscarNombre(@RequestParam String nombre){
        return productService.findByName(nombre);
    }
}
