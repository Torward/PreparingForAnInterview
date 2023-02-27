package ru.lomov.hw_2;
/**
 * Стоит заметить,
 * что при использовании класса Iterator
 * для некоторых операций к LinkedList
 * результаты были бы другими.
 * */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[100000];
        for (int i = 0; i < array.length; i++) {
            array [i] =  (int)(Math.random()*100000);
        }
        Integer[] secondArray = new Integer[10000];
        for (int i = 0; i < array.length; i++) {
            array [i] =  (int)(Math.random()*10000);
        }

        System.out.println("Размер списка: " + array.length);
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.printInfo(array, secondArray);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.printInfo(array, secondArray);
    }
}
