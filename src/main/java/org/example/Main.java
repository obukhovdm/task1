package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        Animal[] animal= {
                new Cat("Вася"),
                new Tiger("Петя"),
                new Cat("Мурзик"),
                new Dog("Барсик "),
                new Dog("Платон")};


        int c=0;
        int t=0;
        int d=0;

        for (int i=0;i<animal.length;i++){
            if (animal[i] instanceof Cat){
                c++;
            } else if (animal[i] instanceof Tiger) {
                t++;
            }
            else {
                d++;
            }
        }
        System.out.println("Всего: "+animal.length);
        System.out.println("Котов: "+c);
        System.out.println("Собак: "+d);
        System.out.println("Тигров: "+t);

        for (int i=0;i<animal.length;i++){
            animal[i].run(rand.nextInt(100,600));
            animal[i].swim(rand.nextInt(5,30));
        }

        System.out.println();
        System.out.println("Вариант 1");

        HomeAnimal hamster=new Hamster();
        HomeAnimal goat=new Goat();
        HomeAnimal cow=new Cow();

        hamster.jump();
        hamster.voice();
        goat.jump();
        goat.voice();
        cow.jump();
        cow.voice();
    }
}