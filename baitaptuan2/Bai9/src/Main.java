import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham 1!");
        System.out.print("Ten: ");
        String name1 = sc.nextLine();
        System.out.print("Gia: ");
        double price1 = sc.nextDouble();
        System.out.print("So luong: ");
        int quantity1 = sc.nextInt();
        System.out.print("Giam gia: ");
        double discount1 = sc.nextDouble();
        Product p1 = new Product(name1, price1, quantity1, discount1);
        sc.nextLine();
        System.out.println("Nhap thong tin san pham 2!");
        System.out.print("Ten: ");
        String name2 = sc.nextLine();
        System.out.print("Gia: ");
        double price2 = sc.nextDouble();
        System.out.print("So luong: ");
        int quantity2 = sc.nextInt();
        System.out.print("Giam gia: ");
        double discount2 = sc.nextDouble();
        sc.nextLine();
        Product p2 = new Product(name2, price2, quantity2, discount2);
        //mua ban
        System.out.print("Nhap so luong " + p1.getName() +" ban can mua: ");
        int mua1 = sc.nextInt();
        p1.sell(mua1);
        System.out.print("Nhap so luong " + p2.getName() +" ban can mua: ");
        int mua2 = sc.nextInt();
        p2.sell(mua2);
        //kiem tra tinh chat static
        System.out.println("Gia ban cuoi cung!!");
        System.out.println("Gia ban cua " + p1.getName() + " la: " + p1.caculateFinalPrice());
        System.out.println("Gia ban cua " + p2.getName() + " la: " + p2.caculateFinalPrice());
        Product.updatetaxRate(0.08);
        System.out.println("Gia ban sau khi thue xuong 8%!!");
        System.out.println("Gia ban cua " + p1.getName() + " la: " + p1.caculateFinalPrice());
        System.out.println("Gia ban cua " + p2.getName() + " la: " + p2.caculateFinalPrice());
        p1.updateDiscount(10.0);
        System.out.println("Gia ban cua " + p1.getName() + " sau khi discount duoc sua la: " + p1.caculateFinalPrice());
        System.out.println("Gia ban cua " + p2.getName() + " la: " + p2.caculateFinalPrice());
        System.out.println("Tong doanh thu cua he thong la: " + Product.getTotalRevenue());
    }
}
