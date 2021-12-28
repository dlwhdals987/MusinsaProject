package com.musinsa.controller;
import com.musinsa.service.CategoryService;
import com.musinsa.vo.CategoryVO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @PostMapping(value = "/category/add")
    public String addCategory(@Valid CategoryVO categoryVO) {
        return categoryService.addCategory(categoryVO);
    }

    @PostMapping(value = "/category/update")
    public String updateCategory(@Valid CategoryVO categoryVO) {
        return categoryService.updateCategory(categoryVO);
    }

    @PostMapping(value = "/category/delete")
    public String deleteCategory(@Valid CategoryVO categoryVO) {
        return categoryService.updateCategory(categoryVO);
    }

}