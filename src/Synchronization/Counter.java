package Synchronization;

public class Counter {
    private static int normalCounter = 0;
    private static int synchronizedCounter = 0;

    public static void normalIncrement() {
        normalCounter++;
    }

    public static synchronized void synchronizedIncrement() {
        synchronizedCounter++;
    }

    public static int getNormalCounter() {
        return normalCounter;
    }

    public static int getSynchronizedCounter() {
        return synchronizedCounter;
    }
}
