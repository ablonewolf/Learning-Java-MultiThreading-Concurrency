package thread_creation.withRunnable;

public class FirstRunnable implements Runnable {

    private final Integer finalIndex;

    public FirstRunnable(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (int index = 1; index <= this.finalIndex; index++) {
            try {
                Thread.sleep(1000);
                System.out.println("First Runnable: " + index);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void run() {
        this.execute();
    }
}
