package kr.co.fastcampus.eatgo.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {
    @Test
    public void creation() {
        Category category = Category.builder().name("Korean Food").build();
        assertThat(category.getName()).isEqualTo("Korean Food");
    }
}