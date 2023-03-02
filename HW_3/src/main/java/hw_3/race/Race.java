package hw_3.race;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Race {
    public static void main(String[] args) throws InterruptedException {
        RaceThread raceThread = new RaceThread();
        Thread t1 = new Thread(raceThread);
        Thread t2 = new Thread(raceThread);
            t2.start();
            t1.start();
            Thread.sleep(1000);
    }
}
    class RaceThread extends Thread{
        Lock lock = new ReentrantLock();
        private int x = 0;
        @Override
        public void run() {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println("Текущее состояние переменной: " + x);
                x++;
                System.out.println(Thread.currentThread().getName() + " добавил единицу, получил:  " + x);
            }
            lock.unlock();
        }
        public int getX() {
            return x;
        }
    }

