public class Invoice implements IPayable{
    String itemName;
    int quantity;
    double pricePeritem;

    public Invoice(String _itemName, int _quantity, double _pricePeritem){
        itemName = _itemName;
        quantity = _quantity;
        pricePeritem = _pricePeritem;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPaymentAmount(){
        return quantity * pricePeritem;
    }
}
