package week05;

public class Main {
    public static void main(String[] args) {

        Runnable run = new TestRunnable();
        Thread thread = new Thread(run);

        thread.start();
    }
}
