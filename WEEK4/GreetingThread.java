public class GreetingThread extends Thread {
    private String message;

    public GreetingThread(String message) {
        this.message = message;
    }

    public void run() {
       while(true){ System.out.println(message);}
    }

    public static void main(String[] args) {
        GreetingThread goodMorningThread = new GreetingThread("Good morning");
        GreetingThread welcomeThread = new GreetingThread("Welcome");

        goodMorningThread.start();
        welcomeThread.start();
    }
}