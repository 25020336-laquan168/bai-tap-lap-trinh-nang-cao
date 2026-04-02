public class Inventory {
    private Product[] items;
    public Inventory(Product[] initiallitems){
        items = initiallitems;
    }
    public void showproduct(){
        for(Product x : items){
            x.show();
        }
    }
}
