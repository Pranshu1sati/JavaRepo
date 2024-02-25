public class Q5 extends Thread {
    private String message;

    public Q5(String message) {
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
        Q5 p1 = new Q5("Thread P1");
        Q5 p2 = new Q5("Thread P2");

        // Setting priorities
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread P1 priority: " + p1.getPriority());
        System.out.println("Thread P2 priority: " + p2.getPriority());

        // Starting threads
        p1.start();
        p2.start();

        // Getting and printing the state of each thread
        System.out.println("Thread P1 state: " + p1.getState());
        System.out.println("Thread P2 state: " + p2.getState());
    }
}
