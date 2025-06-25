package com.gescom.services;

import com.gescom.entities.Category;
import com.gescom.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    CategoryServiceImpl(final CategoryRepository repository){
        this.repository = repository;
    }

    @Override
    public void createCategory(Category category) {
        this.repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void deleteCategory(long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void editCategory(Category category, long id) {
        Category c = this.repository.getReferenceById(id);
        c.setDesignation(category.getDesignation());
        this.repository.save(c);
    }
}
