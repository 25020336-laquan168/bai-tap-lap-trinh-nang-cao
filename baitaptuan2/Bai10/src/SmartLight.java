public class SmartLight {
    private String id;
    private String name;
    private int brightness;
    //constructor 1
    public SmartLight(String _id, String _name, int _brightness){
        id = _id;
        name = _name;
        brightness = _brightness;
    }
    //constructor 2
    public SmartLight(String _id, String _name){
        this(_id, _name, 50);
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public void setBrightness(String preset){
        if (preset.equals("MAX")){
            this.setBrightness(100);
        } else if (preset.equals("MIN")){
            this.setBrightness(10);
        } else {
            this.setBrightness(30);
        }
    }
    public void connectToHub(CentralHub hub){
        hub.registerDevice(this);
    }

    public Integer getBrightness(){
        return this.brightness;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
}
