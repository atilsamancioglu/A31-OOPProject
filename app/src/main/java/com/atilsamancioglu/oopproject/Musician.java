package com.atilsamancioglu.oopproject;

public class Musician {

    private String name;
    private String instrument;
    private int age;


    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age, String password) {
        if (password.matches("Atil")) {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }


}
