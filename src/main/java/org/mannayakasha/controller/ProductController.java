package org.mannayakasha.controller;

import org.mannayakasha.entity.Product;
import org.mannayakasha.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 *
 * Created on 06.02.2017.
 *
 * @author Pavel
 * @version 1.0
 */

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
