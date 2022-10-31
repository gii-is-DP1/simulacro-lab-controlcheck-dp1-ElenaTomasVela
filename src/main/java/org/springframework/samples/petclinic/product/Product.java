package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    @Size(min=3, max=50)
    String name;

    @NotNull
    @Positive
    double price;

    @ManyToOne
    ProductType productType;
}
