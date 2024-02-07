package thread_creation.withRunnable;

public class SecondRunnable implements Runnable {

    private final Integer finalIndex;

    public SecondRunnable(Integer finalIndex) {
        this.finalIndex = finalIndex;
    }

    private void execute() {
        for (int index = 1; index <= finalIndex; index++) {
            try {
                Thread.sleep(2000);
                System.out.println("Second Runnable: " + index + " " + Thread.currentThread().getName());
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
