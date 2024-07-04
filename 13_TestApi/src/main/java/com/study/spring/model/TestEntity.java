package com.study.spring.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
@Getter
@Setter
@Builder
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    public TestEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
