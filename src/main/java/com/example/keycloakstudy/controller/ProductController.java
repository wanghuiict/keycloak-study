package com.example.keycloakstudy.controller;

import com.example.keycloakstudy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/products")
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        return "product";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}