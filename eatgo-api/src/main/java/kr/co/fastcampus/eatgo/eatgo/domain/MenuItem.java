package kr.co.fastcampus.eatgo.eatgo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class MenuItem {
    @Id
    @GeneratedValue
    private Long id;

    private Long restaurantId;

    private final String name;

    public MenuItem(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
