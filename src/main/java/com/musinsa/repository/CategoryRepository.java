package com.musinsa.repository;


import com.musinsa.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository  extends JpaRepository<CategoryEntity, Long> {

    CategoryEntity save(CategoryEntity categoryEntity);
    CategoryEntity findById(long categoryHighId);
}
