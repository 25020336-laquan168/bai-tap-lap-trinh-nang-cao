import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        kho<thucpham> khothucpham = new kho<>();
        kho<dodientu> khododientu = new kho<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i ++){
            String line = sc.nextLine();
            String[] lst = line.trim().split(" ");
            String type = lst[0];
            String id = lst[1];
            String name = lst[2];
            if (type.equals("F")){
                String hansudung = lst[3];
                thucpham x = new thucpham(id, name, hansudung);
                khothucpham.nhaphang(x);
            } else {
                String thoigianbh = lst[3];
                dodientu x = new dodientu(id, name, thoigianbh);
                khododientu.nhaphang(x);
            }
        }

        System.out.println("Kho Thực Phẩm:");
        khothucpham.kiemke();
        System.out.println();
        System.out.println("Kho Điện Tử:");
        khododientu.kiemke();
    }
}
