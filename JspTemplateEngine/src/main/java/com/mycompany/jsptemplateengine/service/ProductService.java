/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsptemplateengine.service;

import com.mycompany.jsptemplateengine.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author 20113
 */
@Service
public final class ProductService {
    private final Map<Long, Product> store = new LinkedHashMap<>();
    private final AtomicLong seq = new AtomicLong(1000);

    public ProductService() {
        add(new Product(0, "Laptop", 1200));
        add(new Product(0, "Chuột không dây", 15.5));
        add(new Product(0, "Bàn phím cơ", 65));
    }

    public List<Product> findAll() { return new ArrayList<>(store.values()); }

    public void add(Product p) {
        long id = p.getId() == 0 ? seq.incrementAndGet() : p.getId();
        p.setId(id);
        store.put(id, p);
    }

    public void delete(long id) { store.remove(id); }
}
