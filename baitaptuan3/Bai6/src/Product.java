public class Product {
    public String id;
    public String name;
    public double baseprice;

    public Product(String _id ,String _name, double _baseprice){
        id = _id;
        name = _name;
        baseprice = _baseprice;
    }
    public String getName(){
        return name;
    }
    public double getFinalPrice(){
        return baseprice;
    };
    public String getType(){
        return "this is non product";
    };
}
