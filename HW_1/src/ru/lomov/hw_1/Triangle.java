package ru.lomov.hw_1;

public class Triangle extends Figure{
    @Override
    void printArea(int area) {
        super.printArea(area);
        System.out.println("My shape is triangle.");
    }
}
