abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    @Override
    void ring() {
        System.out.println("Ringing....");
    }
    @Override
    void lift() {
        System.out.println("Lifting....");
    }
    @Override
    void disconnect() {
        System.out.println("Disconnecting....");
    }
    void makeConference(){
        System.out.println("Conference calling....");
    }
}

public class Q4 {
    public static void main(String[] args) {
        TelePhone telePhone = new SmartTelePhone();
        // it's a SmartTelePhone but with no features of SmartTelePhone
        // and only as a normal TelePhone
        telePhone.ring();
        telePhone.lift();
        telePhone.disconnect();
    }
}
