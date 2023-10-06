package org.example;

public class Animal {
    String name;
    public Animal(){
    }
    public Animal(String name){
        this.name=name;
    }

    public void animalInfo(){
        System.out.println("Животное: "+name);
    }

    public void run(int ln){
        System.out.println(this.name+" пробежал "+ln+"м");
    }

    public void swim(int ln){
        System.out.println(this.name+" проплыл "+ln+"м");
    }
}
