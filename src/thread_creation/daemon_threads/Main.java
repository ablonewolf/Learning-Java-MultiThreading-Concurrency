package thread_creation.daemon_threads;

public class Main {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonWorker());
        Thread workerThread = new Thread(new NormalWorker());

        daemonThread.setDaemon(true);
        workerThread.setDaemon(false);

        daemonThread.start();
        workerThread.start();
    }
}
