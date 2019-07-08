package com.academie.excpti;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        if (age < 0) {
            throw new IllegalAgeException("age must be positive");
        }
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
