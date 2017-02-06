package org.mannayakasha.entity;

/**
 * Created on 06.02.2017.
 *
 * @author Pavel
 * @version 1.0
 */

public class Product {

    private String name;
    private String description;
    private Integer price;

    public Product() {

    }

    public Product(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return name + " " + description + " " + price.toString();
    }
}
