package com.example.spring.springCourse1.spring01;

public class Person {
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
        setName("1");
        setScore(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer score;
    private String name;

    public Person(Integer score, String name) {
        this.score = score;
        this.name = name;
    }
}
