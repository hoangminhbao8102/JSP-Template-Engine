/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsptemplateengine.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author 20113
 */
public class Product {
    private long id;

    @NotBlank(message = "Tên không được trống")
    private String name;

    @Min(value = 0, message = "Giá phải >= 0")
    private double price;

    public Product() { }
    public Product(long id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
