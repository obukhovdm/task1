package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int countAnimal=10;
        Random rand=new Random();
        Animal[] animal=new Animal[countAnimal];
        String[] names={"Вася","Барсик","Мурзик","Леон","Бобик","Мусик","Барбоскин","Гав"};
        String[] colors={"Серый","Белый","Черный","Рыжий","Полосатый"};

        for (int i=0;i<countAnimal;i++){
            if (i%3==0) {
                animal[i]=new Cat(names[rand.nextInt(names.length)], colors[rand.nextInt(colors.length)]);
            }
            else if (i%3==1) {
                animal[i]=new Tiger(names[rand.nextInt(names.length)],colors[rand.nextInt(colors.length)]);
            }
            else {
                animal[i]=new Dog(names[rand.nextInt(names.length)],colors[rand.nextInt(colors.length)]);
            }
        }

        int c=0;
        int t=0;
        int d=0;

        for (int i=0;i<countAnimal;i++){
            if (animal[i] instanceof Cat){
                c++;
            } else if (animal[i] instanceof Tiger) {
                t++;
            }
            else {
                d++;
            }
        }

        System.out.println("Котов: "+c);
        System.out.println("Собак: "+d);
        System.out.println("Тигров: "+t);

        for (int i=0;i<countAnimal;i++){
            animal[i].run(rand.nextInt(100,600));
            animal[i].swim(rand.nextInt(5,30));
        }

        System.out.println();
        System.out.println("Варийнт 1");

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