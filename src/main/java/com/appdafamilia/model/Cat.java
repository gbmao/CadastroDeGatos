package com.appdafamilia.model;

public class Cat {
    private String name;
    private Long id;

    public Cat(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    //must be deleted or protected after SpringBoot Implementation
    public void setId(Long id) {
        this.id = id;
    }
}
