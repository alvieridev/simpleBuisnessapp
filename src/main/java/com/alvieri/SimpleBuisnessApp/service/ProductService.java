package com.alvieri.SimpleBuisnessApp.service;

import com.alvieri.SimpleBuisnessApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(111, "BlackBerry", 3000),
            new Product(11, "BlackBerry key", 2000),
            new Product(121, "Iphone", 1000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodID) {
        return products.stream().filter( p -> p.getProdID() == prodID)
                .findFirst().get();
    }

    public List<Product> addProduct(Product prod){
        products.add(prod);
        return products;
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getProdID() == prod.getProdID()){
                index = i;
            }
        }
        System.out.println("INDEX FOUND: " + index);
        products.set(index, prod);
    }

    public void deleteProd(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getProdID() == prodId){
                index = i;
            }
        }
        products.remove(index);
    }
}

