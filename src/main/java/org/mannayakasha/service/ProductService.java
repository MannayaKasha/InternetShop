package org.mannayakasha.service;

import org.mannayakasha.dao.ProductDao;
import org.mannayakasha.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created on 06.02.2017.
 *
 * @author Pavel
 * @version 1.0
 */

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Collection<Product> getAllProducts(){
        return productDao.getAllProducts();
    }
}
