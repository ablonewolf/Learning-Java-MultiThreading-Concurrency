package Synchronization;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After executing both of the threads, the normal counter is: " + Counter.getNormalCounter());
        System.out.println("After executing both of the threads, the synchronized counter is: " +
                Counter.getSynchronizedCounter());
    }
}
