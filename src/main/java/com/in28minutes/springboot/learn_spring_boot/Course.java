package com.in28minutes.springboot.learn_spring_boot;

public class Course {
    private final long id;
    private final String name;
    private final String author;

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    /* Getters */
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    /* Util methods */

    @Override
    public String toString() {
        return String.format("Course: [id=%s, name=%s, author=%s]", id, name, author);
    }
}
