package com.finaldatabasewebapp.shoppingapp.repository.Category;

import com.finaldatabasewebapp.shoppingapp.model.Category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
