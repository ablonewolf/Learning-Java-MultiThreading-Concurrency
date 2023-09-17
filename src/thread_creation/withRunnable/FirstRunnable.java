package thread_creation.withRunnable;

public class FirstRunnable implements Runnable {

    private final Integer finalIndex;

    public FirstRunnable(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (Integer index = 1; index <= this.finalIndex; index++) {
            System.out.println("First Runnable: " + index);
        }
    }

    @Override
    public void run() {
        this.execute();
    }
}
