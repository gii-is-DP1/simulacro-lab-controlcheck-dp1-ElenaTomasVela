package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public List<ProductType> findAllProductTypes() {
        return repo.findAllProductTypes();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return repo.findByPriceByLessThan(price);
    }

    public ProductType getProductType(String typeName) {
        return repo.findTypeByName(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
