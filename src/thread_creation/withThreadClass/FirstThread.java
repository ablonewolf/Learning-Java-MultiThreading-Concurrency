package thread_creation.withThreadClass;

public class FirstThread extends Thread {

    private final Integer finalIndex;

    public FirstThread(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (Integer index = 1; index <= this.finalIndex; index++) {
            System.out.println("First Thread: " + index);
        }
    }

    @Override
    public void run() {
        this.execute();
    }
}
