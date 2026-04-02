import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        librarysection<Sach> sach = new librarysection<>();
        librarysection<diaDVD> diaDVD = new librarysection<>();


        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] lst = line.trim().split(" ");
            String type = lst[0];
            String id = lst[1];
            String name = lst[2];
            if (type.equals("B")){
                String tacgia = lst[3];
                int sotrang = Integer.parseInt(lst[4]);
                sach.themtailieu(new Sach(id, name, tacgia, sotrang));
            } else {
                String daodien = lst[3];
                int thoiluong = Integer.parseInt(lst[4]);
                diaDVD.themtailieu(new diaDVD(id, name, daodien, thoiluong));
            }
        }

        System.out.println("Khu vực Sách:");
        sach.dstailieu();
        System.out.println();

        System.out.println("Khu vực DVD:");
        diaDVD.dstailieu();
    }
}
