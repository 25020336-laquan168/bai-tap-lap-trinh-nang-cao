public class VIP extends Room{
    private final double price = 2000000;

    public VIP(int _days){
        super(_days);
    }

    public double getPrice(){
        return price * days;
    }
}
