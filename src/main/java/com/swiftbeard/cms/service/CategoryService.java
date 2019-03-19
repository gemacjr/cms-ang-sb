package com.swiftbeard.cms.service;

import com.swiftbeard.cms.models.Category;
import com.swiftbeard.cms.repository.CategoryRepository;
import com.swiftbeard.cms.vo.CategoryRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category update(Category category){
        return this.categoryRepository.save(category);
    }

    public Category create(CategoryRequest request){
        Category category = new Category();
        category.setName(request.getName());
        return this.categoryRepository.save(category);
    }

    public void delete(String id){
        final Category category = this.categoryRepository.findOne(id);
        this.categoryRepository.delete(category);
    }

    public List<Category> findAll(){
        return this.categoryRepository.findAll();
    }

    public Category findOne(String id){
        return this.categoryRepository.findOne(id);
    }

}
