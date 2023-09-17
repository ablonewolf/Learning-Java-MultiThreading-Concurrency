package thread_creation.withThreadClass;

public class SecondThread extends Thread {

    private final Integer finalIndex;

    public SecondThread(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (Integer index = 1; index <= this.finalIndex; index++) {
            try {
                System.out.println("Second Thread: " + index);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        this.execute();
    }
}
