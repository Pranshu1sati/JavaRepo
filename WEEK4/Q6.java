public class Q6 extends Thread {
    private String message;

    public Q6(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
        if (message.equals("Welcome")) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Q6 p1 = new Q6("Thread P1");
        Q6 p2 = new Q6("Thread P2");

        // Setting priorities
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread P1 priority: " + p1.getPriority());
        System.out.println("Thread P2 priority: " + p2.getPriority());

        // Starting threads
        p1.start();
        System.out.println("Current thread in main method: " + Thread.currentThread().getName());
        p2.start();

        // Getting and printing the state of each thread
        System.out.println("Thread P1 state: " + p1.getState());
        System.out.println("Current thread in main method: " + Thread.currentThread().getName());
        System.out.println("Thread P2 state: " + p2.getState());

        // Get a reference to the current thread in the main method
        Thread currentThread = Thread.currentThread();
        System.out.println("Current thread in main method: " + currentThread.getName());
    }
}
