package ru.lomov.hw_2;


import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    private final LinkedList<Integer> list = new LinkedList<>();

    public void printInfo(Integer[] array, Integer[] secondArray) {
        System.out.println("Внимание! Работает LinkedListExample!");
        addAll(array);
        insert(secondArray);
        get();
        remove();
        set();

    }

    private void addAll(Integer[] array) {
        Instant startAddAll = Instant.now();
        list.addAll(List.of(array));
        Instant finishAddAll = Instant.now();
        long difAddAll = Duration.between(startAddAll, finishAddAll).toMillis();
        System.out.println("Метод addAll сработал за: " + difAddAll + "ms");
    }
    private void insert(Integer[] secondArray) {
        Instant startInsert = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.add(i, i + 1);
        }
        Instant finishInsert = Instant.now();
        long difInsert = Duration.between(startInsert, finishInsert).toMillis();
        System.out.println("Метод insert сработал за: " + difInsert + "ms");
    }

    private void get() {
        Instant startGet = Instant.now();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        Instant finishGet = Instant.now();
        long difGet = Duration.between(startGet, finishGet).toMillis();
        System.out.println("Метод get сработал за: " + difGet + "ms");
    }

    private void remove() {
        Instant startRemove = Instant.now();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        Instant finishRemove = Instant.now();
        long difRemove = Duration.between(startRemove, finishRemove).toMillis();
        System.out.println("Метод remove сработал за: " + difRemove + "ms");
    }

    private void set(){
        Instant startSet = Instant.now();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i+1);
        }
        Instant finishSet = Instant.now();
        long difSet = Duration.between(startSet, finishSet).toMillis();
        System.out.println("Метод set сработал за: " + difSet + "ms");
    }


}
