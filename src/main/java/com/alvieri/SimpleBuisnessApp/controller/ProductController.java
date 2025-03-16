package com.alvieri.SimpleBuisnessApp.controller;
import com.alvieri.SimpleBuisnessApp.model.Product;
import com.alvieri.SimpleBuisnessApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        System.out.println("ALL PRODUCTS: " + productService.getProducts());

        return productService.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return  productService.getProductById(prodId);
    }

    @PostMapping("/add-product")
    public List<Product> addProduct(@RequestBody Product prod){
        System.out.println(prod.toString());
        return  productService.addProduct(prod);
    }

    public void
}
