public class Multithreading_15 implements Runnable {
    private final int threadId;
    private final int delay;

    public Multithreading_15(int threadId, int delay) {
        this.threadId = threadId;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + threadId + " started");
            Thread.sleep(delay);
            System.out.println("Thread " + threadId + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Multithreading_15 runnable1 = new Multithreading_15(1, 2000);
        Multithreading_15 runnable2 = new Multithreading_15(2, 3000);
        Multithreading_15 runnable3 = new Multithreading_15(3, 1500);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
