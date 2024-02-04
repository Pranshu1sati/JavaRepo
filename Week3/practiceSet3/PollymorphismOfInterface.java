interface MyCamera {
    void takeSnap();
    void recordVideo();
    private void start(){
        System.out.println("Starting Camera....");
    }
    default void recordLive(){
        start();
        System.out.println("Recording Live in 4K");
    }
}
interface MyWifi {
    String[] networks = {"LANnister","Pranshu'sWifi","ChickenWing","RenocrewSoultions"};
    String[] getNetworks();
    void connectToNetwork(String ntwID);
}
class MyCellPhone {
    void callNumber(long phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    @Override
    public void takeSnap() {
        System.out.println("Clicking Snap....");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording Video....");
    }

    
    @Override
    public void recordLive() {
        System.out.println("Recording Live in 1080p....");
    }
     
    @Override
    public String[] getNetworks() {
        System.out.println("Getting the list of Networks....");
        return MyWifi.networks;
    }

    @Override
    public void connectToNetwork(String ntw) {
        System.out.println("Connecting to...."+ntw);
    }
}

public class PollymorphismOfInterface {
    public static void main(String[] args) {
        
        MyCamera myCamera = new MySmartPhone();
        myCamera.takeSnap();
        myCamera.recordVideo();
        myCamera.recordLive();
       
    }
}