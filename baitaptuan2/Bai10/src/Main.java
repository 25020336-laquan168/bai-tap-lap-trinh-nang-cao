public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();
        SmartLight l1 = new SmartLight("L01", "Den phong khach", 80);
        SmartLight l2 = new SmartLight("L01", "Den phong ngu");
        l2.setBrightness("ECO");
        hub.registerDevice(l1);
        hub.registerDevice(l2);
        System.out.println("Do sang cua den " + l1.getName() + " la: " + l1.getBrightness());
        System.out.println("Do sang cua den " + l2.getName() + " la: " + l2.getBrightness());
    }
}
