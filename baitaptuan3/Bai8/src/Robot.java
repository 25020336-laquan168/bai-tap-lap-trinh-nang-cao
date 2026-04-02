abstract public class Robot {
    private int id;
    private String name;
    private int batteryLevel;

    public Robot (int _id, String _name){
        id = _id;
        name = _name;
    }

    public void chargeBattery(){
        batteryLevel = 100;
    }

    public void showIdentity(){
        System.out.println(this.id + " - " + this.name);
    }

    abstract public void performMaintask();

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
