package kr.co.fastcampus.eatgo.eatgo.application;

import kr.co.fastcampus.eatgo.eatgo.domain.Category;
import kr.co.fastcampus.eatgo.eatgo.domain.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class CategoryServiceTest {

    @InjectMocks
    private CategoryService categoryService;

    @Mock
    private CategoryRepository categoryRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getCategories() {
        List<Category> mockCategory = new ArrayList<>();
        mockCategory.add(Category.builder().name("Korean Food").build());

        given(categoryRepository.findAll()).willReturn(mockCategory);

        List<Category> categories = categoryService.getCategories();

        Category category = categories.get(0);
        assertThat(category.getName()).isEqualTo("Korean Food");
    }
}