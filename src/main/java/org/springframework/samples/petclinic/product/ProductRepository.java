package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;


public interface ProductRepository extends CrudRepository<Product, Integer>{
    List<Product> findAll();

    @Query(value = "SELECT t FROM ProductType t")
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);

    @Query(value = "SELECT p FROM Product p WHERE p.name = :pname")
    Product findByName(@Param("pname") String name);

    @Query(value = "SELECT t FROM ProductType t WHERE t.name = :pname")
    ProductType findTypeByName(@Param("pname") String typeName);

    @Query(value = "SELECT p FROM Product p WHERE p.price < :p")
    List<Product> findByPriceByLessThan(@Param("p") double p);

    Product save(Product p);
}
