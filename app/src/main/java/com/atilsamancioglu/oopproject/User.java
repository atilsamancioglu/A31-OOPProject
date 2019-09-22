package com.atilsamancioglu.oopproject;

public class User extends People{

    //Property

    String name;
    String job;


    //Constructor


    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User created");
    }


}
