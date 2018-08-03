package com.example.sqldemo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserEntity  {
    @Id
    @GeneratedValue
    private  Integer id;
    private String name;
    private Integer age;

    //必须要有构造函数
    public UserEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
