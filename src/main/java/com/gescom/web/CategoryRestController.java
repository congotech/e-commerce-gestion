package com.gescom.web;

import com.gescom.entities.Category;
import com.gescom.models.CategoryModel;
import com.gescom.services.CategoryService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryRestController {

    final CategoryService categoryService;

    CategoryRestController(final CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    void createCategory(@RequestBody @Validated CategoryModel categoryModel){
        Category category = new Category();
        category.setDesignation(categoryModel.getDesignation());

        this.categoryService.createCategory(category);
    }

    @GetMapping("/categories")
    List<Category> findAllCategories(){
        return this.categoryService.findAll();
    }

    @DeleteMapping("categories/{id}")
    void deleteCategories(@PathVariable("id") long id){
        this.categoryService.deleteCategory(id);
    }
}
