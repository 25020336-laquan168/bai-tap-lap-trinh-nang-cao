abstract public class Staff implements IPayable{
    String id;
    String name;
    public Staff(String _id, String _name){
        id = _id;
        name = _name;
    }

    public void setId(String newId){
        id = newId;
    }

    public String getId(){
        return id;
    }

    public void setName(String newName){
        id = newName;
    }

    public String getName(){
        return name;
    }
}
