import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hub hub = new Hub();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] lst = line.trim().split(" ");
            String type = lst[0];
            String id = lst[1];
            String name = lst[2];
            if (type.equals("L")){
                thietbi x = new den(id, name);
                hub.themthietbi(x);
            } else if (type.equals("AC")){
                thietbi x = new dieuhoa(id, name);
                hub.themthietbi(x);
            } else if (type.equals("S")){
                thietbi x = new loa(id, name);
                hub.themthietbi(x);
            } else if (type.equals("C")){
                thietbi x = new rem(id, name);
                hub.themthietbi(x);
            }
        }
        hub.tat();
        System.out.println();
        hub.ketnoi();
    }
}
