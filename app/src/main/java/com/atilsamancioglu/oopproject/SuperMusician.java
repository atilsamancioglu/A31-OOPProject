package com.atilsamancioglu.oopproject;

public class SuperMusician extends Musician {


    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing() {
        return "Nothing Else Matters";
    }

}
