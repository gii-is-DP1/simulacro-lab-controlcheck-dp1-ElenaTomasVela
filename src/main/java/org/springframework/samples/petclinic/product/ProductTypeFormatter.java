package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{

    @Autowired
    ProductService service;

    @Override
    public String print(ProductType object, Locale locale) {
        return object.getName();
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {

        ProductType result = service.getProductType(text);
        if(result == null) {

            throw new ParseException("Unable to parse", 0);
        }

        return result;

    }
    
}
