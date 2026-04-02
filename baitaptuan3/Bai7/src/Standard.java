public class Standard extends Room{
    private final double price = 500000;

    public Standard(int _days){
        super(_days);
    }

    public double getPrice(){
        if (days > 3){
            return (price * days) * 0.95;
        } else{
            return (price * days);
        }
    }

}
