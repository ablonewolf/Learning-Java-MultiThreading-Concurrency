package thread_creation.withThreadClass;

public class FirstThread extends Thread {

    private final Integer finalIndex;

    public FirstThread(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (int index = 1; index <= this.finalIndex; index++) {
            try {
                System.out.println("First Thread: " + index);
                Thread.sleep(1000);
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
