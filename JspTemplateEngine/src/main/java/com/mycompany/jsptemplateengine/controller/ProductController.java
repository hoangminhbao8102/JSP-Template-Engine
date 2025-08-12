/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsptemplateengine.controller;

import com.mycompany.jsptemplateengine.model.Product;
import com.mycompany.jsptemplateengine.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

/**
 *
 * @author 20113
 */
@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) { this.service = service; }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("pageTitle", "Sản phẩm (map/filter/sort demo)");
        model.addAttribute("products", service.findAll());
        return "products";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("pageTitle", "Thêm sản phẩm");
        model.addAttribute("product", new Product());
        return "product-form";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("product") Product p, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("pageTitle", "Thêm sản phẩm - Lỗi");
            return "product-form";
        }
        service.add(p);
        return "redirect:/products";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        service.delete(id);
        return "redirect:/products";
    }
}
