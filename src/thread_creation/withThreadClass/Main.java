package thread_creation.withThreadClass;

public class Main {
    public static void main(String[] args) {
//      Creating Thread instances using Thread class
        Thread firstThread = new FirstThread(8);
        Thread secondThread = new SecondThread(8);
//      Starting both threads
        firstThread.start();
        secondThread.start();
    }
}
