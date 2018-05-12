package com.example.jonatan.jonstart;

import android.util.Log;

/**
 * Created by Jonatan on 05.05.2018.
 */

public class User implements UserInterface{
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sayHello() {
        Log.d("sayHello", "HELLO GUYS");
    }
}
