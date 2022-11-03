package com.finaldatabasewebapp.shoppingapp.service.Category;

import com.finaldatabasewebapp.shoppingapp.model.Category.Category;
import com.finaldatabasewebapp.shoppingapp.repository.Category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
