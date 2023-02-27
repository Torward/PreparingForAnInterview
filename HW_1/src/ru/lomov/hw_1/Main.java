package ru.lomov.hw_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .addGender("Male")
                .build();
        Figure figure = new Circle();
        figure.printArea(25);
    }
}
