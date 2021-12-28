package com.musinsa.service;

import com.musinsa.domain.CategoryEntity;
import com.musinsa.repository.CategoryRepository;
import com.musinsa.vo.CategoryVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public String addCategory(CategoryVO categoryVO)
    {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryTitle(categoryVO.getCategoryTitle());
        categoryEntity.setHighCodeId(categoryRepository.findById(categoryVO.getHighCode()));
        categoryEntity.setCreateDate(LocalDateTime.now());
        categoryEntity.setUseYn('Y');
        try {
            categoryRepository.save(categoryEntity);
        }catch (Exception e)
        {
            return "fail";
        }

        return "successes";
    }

    public String updateCategory(CategoryVO categoryVO)
    {
        CategoryEntity categoryEntity = categoryRepository.findById(categoryVO.getId());
        categoryEntity.setCategoryTitle(categoryVO.getCategoryTitle());
        categoryEntity.setHighCodeId(categoryRepository.findById(categoryVO.getHighCode()));
        categoryEntity.setUpdateDate(LocalDateTime.now());
        categoryEntity.setUseYn(categoryVO.getUseYn());
        try {
            categoryRepository.save(categoryEntity);
        }catch (Exception e)
        {
            return "fail";
        }

        return "successes";
    }

    public String deleteCategory(CategoryVO categoryVO)
    {
        CategoryEntity categoryEntity = categoryRepository.findById(categoryVO.getId());
        categoryEntity.setUpdateDate(LocalDateTime.now());
        categoryEntity.setUseYn('N');
        try {
            categoryRepository.save(categoryEntity);
        }catch (Exception e)
        {
            return "fail";
        }
        return "successes";
    }
}
