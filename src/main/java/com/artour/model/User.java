package com.artour.model;

import javax.persistence.*;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "number")
    private int number;
    @Column(name = "name")
    private String name;
    @Column(name = "born")
    private int born;
    @Column(name = "died")
    private int died;
    @Column(name = "age")
    private int age;
    @Column(name = "note")
    private String note;

    public User() {
    }

    public User(int number, String name, int born, int died, int age, String note) {
        this.number = number;
        this.name = name;
        this.born = born;
        this.died = died;
        this.age = age;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public int getDied() {
        return died;
    }

    public void setDied(int died) {
        this.died = died;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return id + " " + number + " " + name + " " + born + " " + died + " " + age + " " + note;
    }
}
