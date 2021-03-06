package com.spring.pet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pet.entity.Category;
import com.spring.pet.repository.CategoryRepository;

//import antlr.collections.List;

@Service
public class CategoryService{
    @Autowired
    CategoryRepository categoryRepository;
    public List <Category>getAllCategory(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
	public Optional<Category> getCategoryById(int id) {
		Optional<Category> list=categoryRepository.findById(id);
		return list;
	}
	public void removeCategoryById(int id) {
		categoryRepository.deleteById(id);
		
	}
   
}
