package com.pluralsight;

public class Animal {
    public void setSpecies(String species) {
        this.species = species;
    }

    private String name;
    private float weight;
    private int age;

    public String getSpecies() {
        return species;
    }

    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(float amountOfFood){
        this.weight += amountOfFood;
    }


    @Override
    public String toString(){
        return this.name + " is my pet " + this.species;
    }

}