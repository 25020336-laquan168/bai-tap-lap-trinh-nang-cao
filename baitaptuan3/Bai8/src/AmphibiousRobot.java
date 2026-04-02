public class AmphibiousRobot extends Robot implements Flyable, GPS, Swimmable{
    public AmphibiousRobot(int _id, String _name){
        super(_id, _name);
    }

    public void performMaintask(){
        System.out.println(getName() + " performing main task");
    }

    public void fly(){
        System.out.println(getName() + " flying");
    }

    public void getCoordinates(){
        System.out.println(getName() + " getting coordinates");
    }

    public void swim() {
        System.out.println(getName() + " swimming");
    }
}
