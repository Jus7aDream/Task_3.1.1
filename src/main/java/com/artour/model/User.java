package com.artour.model;

public class User {
    private final int number;
    private final String name;
    private final int born;
    private final int died;
    private final int age;
    private final String note;


    public User(int number, String name, int born, int died, int age, String note) {
        this.number = number;
        this.name = name;
        this.born = born;
        this.died = died;
        this.age = age;
        this.note = note;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBorn() {
        return born;
    }

    public int getDied() {
        return died;
    }

    public int getAge() {
        return age;
    }

    public String getNote() {
        return note;
    }
}
