package org.example;

public class Cat extends Animal{
    String color;

    public Cat(String name, String color){
        this.name=name;
        this.color=color;
    }

    public void run(int ln){
        if (ln<200) {
            super.run(ln);
        }
        else{
            System.out.println(this.name+" не может столько пробежать!");
        }
    }

    public void swim(int ln){
        System.out.println(this.name+" не умеет плавать!!!");
    }

    public void catInfo(){
        System.out.println("Кот, имя: "+name+" цвет: "+color);
    }
}
