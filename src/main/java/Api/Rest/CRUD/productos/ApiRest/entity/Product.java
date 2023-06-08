package Api.Rest.CRUD.productos.ApiRest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String marca;
    private String descripcion;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
  /*
    @Column(name = "crea_articulo")
    @Temporal(TemporalType.DATE)

    private Date creararticulo;

  public Date getCreararticulo(){
        return creararticulo;
    }

    public void setCreararticulo(Date creararticulo){
        this.creararticulo = creararticulo;
    }*/
}
