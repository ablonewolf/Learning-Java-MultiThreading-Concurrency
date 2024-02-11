package thread_creation.daemon_threads;

public class DaemonWorker implements Runnable{
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon Thread is running.");
        }
    }
}
