package org.example;

public class Dog extends Animal{
    String color;

    public Dog(String name, String color){
        this.name=name;
        this.color=color;
    }

    public void run(int ln){
        if (ln<500) {
            super.run(ln);
        }
        else{
            System.out.println(this.name+" не может столько пробежать!");
        }
    }

    public void swim(int ln){
        if (ln<10) {
            super.swim(ln);
        }
        else{
            System.out.println(this.name+" не может столько проплыть!");
        }
    }
    public void dogInfo(){
        System.out.println("Собака, имя: "+name+" цвет: "+color);
    }
}
