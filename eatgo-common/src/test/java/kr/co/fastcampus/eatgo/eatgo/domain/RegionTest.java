package kr.co.fastcampus.eatgo.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class RegionTest {

    @Test
    public void creation() {
        Region region = Region.builder().name("Seoul").build();
        assertThat(region.getName()).isEqualTo("Seoul");
    }
}