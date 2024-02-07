package thread_creation.withRunnable;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstRunnable(8));
        Thread secondThread = new Thread(new SecondRunnable(8));

//        starting the first thread
        firstThread.start();
//        starting the second thread
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finished executing both threads.");
    }
}
