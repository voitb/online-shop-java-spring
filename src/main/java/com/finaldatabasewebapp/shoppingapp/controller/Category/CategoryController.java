package com.finaldatabasewebapp.shoppingapp.controller.Category;

import com.finaldatabasewebapp.shoppingapp.model.Category.Category;
import com.finaldatabasewebapp.shoppingapp.service.Category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAllCategory() {return categoryService.getAllCategory();}
}
