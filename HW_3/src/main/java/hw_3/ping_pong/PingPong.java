package hw_3.ping_pong;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class PingPong {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        pingPong.start();
    }
    private void start(){
        Thread first = new Thread(new Turn("ping"), "first");
        first.start();
        Thread second = new Thread(new Turn("pong"), "second");
        second.start();
    }

    protected class Turn implements Runnable{
        private final String msg;
        public Turn(String msg) {
            this.msg = msg;
        }
        @Override
        public void run() {
            while (true){
                try {
                    printWord(msg);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    protected synchronized void printWord(String msg) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - " +msg);
        sleep(400);
        notify();
        wait();
    }
}
