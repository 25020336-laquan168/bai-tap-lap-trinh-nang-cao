public class Product {
    //instance fields
    private String name;
    private double price;
    private int quantity;
    private double discount;
    //static fields
    //static la bien cua class,chu khong phai bien cua tung obj rieng le
    private static double taxRate = 0.1;
    private static double totalRevenue = 0;

    public Product(String _name, double _price, int _quantity, double _discount){
        name = _name;
        price = _price;
        quantity = _quantity;
        discount = _discount;
    }

    public static void updatetaxRate(double newRate){
        taxRate = newRate;
    }

    public double caculateFinalPrice(){
        double finalPrice = (price - discount) * (1 + taxRate);
        return finalPrice;
    }

    public void updateDiscount(double newDiscount){
        discount = newDiscount;
    }

    public void sell(int amount){
        if (amount <= quantity){
            quantity -= amount;
            double money = (amount * caculateFinalPrice());
            totalRevenue += money;
            System.out.println("Da ban thanh cong");
        } else {
            System.err.println("Khong du hang trong kho");
        }
    }

    public String getName(){
        return name;
    }

    public static double getTotalRevenue(){
        return totalRevenue;
    }

}
