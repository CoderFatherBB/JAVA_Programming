public class Multithreading_14 extends Thread {
    private final int threadId;
    private final int delay;

    public Multithreading_14(int threadId, int delay) {
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
        Multithreading_14 thread1 = new Multithreading_14(1, 2000);
        Multithreading_14 thread2 = new Multithreading_14(2, 3000);
        Multithreading_14 thread3 = new Multithreading_14(3, 1500);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
