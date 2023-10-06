package org.example;

public class Tiger extends Animal {

    String color;

    public Tiger(String name, String color){
        this.name=name;
        this.color=color;
    }
    public void tigerInfo(){
        System.out.println("Тигр, имя: "+name+" цвет: "+color);
    }
}
