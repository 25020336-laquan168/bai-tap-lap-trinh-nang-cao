public class Main {
    public static void main(String[] args) {
        Product[] arr = new Product[2];
        arr[0] = new Product("01", "Laptop", 2000);
        arr[1] = new Product("02", "Dien thoai", 800);
        System.out.println("cac vat pham trong kho luc dau:");
        Inventory kho = new Inventory(arr);
        kho.showproduct();
        arr[0].setPrice(3000);
        //vì đã deep copy nên giá của vật phẩm Laptop sẽ không bị thay đổi thành 3000
        System.out.println("cac vat pham trong kho luc sau:");
        kho.showproduct();
    }
}
