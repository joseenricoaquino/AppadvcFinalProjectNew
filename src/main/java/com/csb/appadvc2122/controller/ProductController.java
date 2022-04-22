package com.csb.appadvc2122.controller;

import com.csb.appadvc2122.dto.ProductDTO;
import com.csb.appadvc2122.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("products", productService.list());
        return "product/index";
    }

    @GetMapping("/add")
    private String getProductAddForm(Model model) {
        model.addAttribute("product", new ProductDTO());
        return "product/add-product";
    }

    @PostMapping
    private String add(@Valid @ModelAttribute("product") ProductDTO product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("product", product);
            return "product/add-product";
        }
        productService.add(product);
        return list(model);
    }

    @GetMapping("/{id}")
    private String get(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.get(id));
        return "product/view-product";
    }

    @PutMapping
    private String update(ProductDTO product, Model model) {
        productService.update(product);
        return list(model);
    }

    @DeleteMapping
    private String delete(ProductDTO product, Model model) {
        productService.delete(product.getId());
        return list(model);
    }

}
