package ru.lomov.hw_1;

public class Circle extends Figure{

    @Override
    void printArea(int area) {
        System.out.println("My shape is circle.");
        super.printArea(area);
    }
}
