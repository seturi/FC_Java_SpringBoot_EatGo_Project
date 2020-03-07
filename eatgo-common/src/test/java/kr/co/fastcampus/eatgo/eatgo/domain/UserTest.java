package kr.co.fastcampus.eatgo.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void creation() {
        User user = User.builder()
                .email("tester@example.com")
                .name("Tester")
                .level(100L)
                .build();

        assertThat(user.getName()).isEqualTo("Tester");
        assertThat(user.isAdmin()).isEqualTo(true);
        assertThat(user.isActive()).isEqualTo(true);

        user.deactivate();
        assertThat(user.isActive()).isEqualTo(false);
    }

    @Test
    public void restaurantOwner() {
        User user = User.builder().level(1L).build();

        assertThat(user.isRestaurantOwner()).isEqualTo(false);

        user.setRestaurantId(1004L);

        assertThat(user.isRestaurantOwner()).isEqualTo(true);
        assertThat(user.getRestaurantId()).isEqualTo(1004L);
    }
}