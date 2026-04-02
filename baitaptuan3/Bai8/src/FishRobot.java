public class FishRobot extends Robot implements Swimmable {
    public FishRobot(int _id, String _name){
        super(_id, _name);
    }

    public void performMaintask(){
        System.out.println(getName() + " performing main task");
    }

    public void swim(){
        System.out.println(getName() + " swimming");
    }

}
