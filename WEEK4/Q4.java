public class Q4 extends Thread {
    private String message;

    public Q4(String message) {
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
        Q4 p1 = new Q4("Thread P1");
        Q4 p2 = new Q4("Thread P2");

        // Setting priorities
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread P1 priority: " + p1.getPriority());
        System.out.println("Thread P2 priority: " + p2.getPriority());

        p1.start();
        p2.start();
    }
}
