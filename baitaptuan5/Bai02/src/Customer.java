public class Customer {
    String id;
    String name;
    public Customer(String _id, String _name){
        id = _id;
        name = _name;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
