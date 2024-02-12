package Synchronization;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Counter.normalIncrement();
            Counter.synchronizedIncrement();
        }
    }
}
