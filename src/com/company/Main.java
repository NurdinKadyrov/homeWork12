package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Parrot parrot = new Parrot();
        cat.setName("Momo");
        cat.setAddres("Home");
        cat.setYear(2);
        System.out.println(cat.toString());

        dog.setName("Max");
        dog.setAddress("Home");
        dog.setYear(3);
        System.out.println(dog.toString());

        fish.setName("Bob");
        fish.setAddress("Lake");
        fish.setYear(1);
        System.out.println(fish.toString());

        parrot.setName("Kuku");
        parrot.setAddress("Forest");
        parrot.setYear(1);
        System.out.println(parrot.toString());
    }
}
