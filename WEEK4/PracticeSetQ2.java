public class PracticeSetQ2 extends Thread {
    private String message;

    public PracticeSetQ2(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            if (message.equals("Welcome")) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        GreetingThread goodMorningThread = new GreetingThread("Good morning");
        GreetingThread welcomeThread = new GreetingThread("Welcome");

        goodMorningThread.start();
        welcomeThread.start();
    }
}