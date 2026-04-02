public class Product {
    private String id;
    private String name;
    private double price;
    public Product(String _id, String _name, double _price){
        id = _id;
        name = _name;
        price = _price;
    }
    public Product(Product khac){
        this.id = khac.id;
        this.name = khac.name;
        this.price = khac.price;
    }
    public void setPrice(double _price){
        price = _price;
    }
    public double getPrice(){
        return price;
    }
    public void show(){
        System.out.println(id + " - " + name + " - " + price);
    }
}
