package thread_creation.daemon_threads;

public class NormalWorker implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Normal worker thread has finished execution.");
    }
}
