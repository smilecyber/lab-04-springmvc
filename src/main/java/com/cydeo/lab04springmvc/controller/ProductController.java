package com.cydeo.lab04springmvc.controller;

import com.cydeo.lab04springmvc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/search-product/{name}")
    public String searchProduct(@PathVariable("name") String name, Model model){
        model.addAttribute("productList", productService.searchProduct(name));
        return "product/product-list";
    }
}
