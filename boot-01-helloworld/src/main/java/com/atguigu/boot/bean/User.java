package com.atguigu.boot.bean;

import lombok.*;

@ToString
@Data
@NoArgsConstructor
@EqualsAndHashCode
//@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name, Integer age){
        this.name = name;
        this.age = age;

    }
}
