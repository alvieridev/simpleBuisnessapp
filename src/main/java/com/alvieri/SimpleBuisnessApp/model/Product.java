package com.alvieri.SimpleBuisnessApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int prodID;
    private String prodName;
    private int price;


    public Product() {
    }

    public Product(int prodID, String prodName, int price) {
        this.prodID = prodID;
        this.price = price;
        this.prodName = prodName;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
