package com.example.buyPhone.controllers;

import com.example.buyPhone.models.Product;
import com.example.buyPhone.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;



    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.findByAll());
        return "products";

    }
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product-info";
    }
    @PostMapping("/product/create")
    public String addProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }
    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
    @PostMapping("/product/update/{id}")
    public String updateProduct(Product product, @PathVariable Long id){
        productService.updateProduct(id, product);
        return "redirect:/";
    }
}
