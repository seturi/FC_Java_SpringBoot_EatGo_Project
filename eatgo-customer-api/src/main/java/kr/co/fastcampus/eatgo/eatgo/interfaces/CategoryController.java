package kr.co.fastcampus.eatgo.eatgo.interfaces;

import kr.co.fastcampus.eatgo.eatgo.application.CategoryService;
import kr.co.fastcampus.eatgo.eatgo.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> list() {
        List<Category> categories = categoryService.getCategories();
        return categories;
    }
}