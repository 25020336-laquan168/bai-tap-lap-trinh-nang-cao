public abstract class Product {
    protected String id;
    protected String name;

    public Product(String _id, String _name){
        id = _id;
        name = _name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public abstract void Info();
}
