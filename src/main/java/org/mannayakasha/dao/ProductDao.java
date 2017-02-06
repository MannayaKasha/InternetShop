package org.mannayakasha.dao;

import org.mannayakasha.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 06.02.2017.
 *
 * @author Pavel
 * @version 1.0
 */

@Repository
public class ProductDao {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<Integer, Product>(){
            {
                put(1, new Product("Car", "super car", 100));
                put(2, new Product("Car2", "super car2", 200));
                put(3, new Product("Car3", "super car3", 300));
            }
        };
    }

    public Collection<Product> getAllProducts(){
        return products.values();
    }

}
