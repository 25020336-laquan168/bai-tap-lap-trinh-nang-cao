import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] list = line.trim().split(" ");
        String type = list[0];
        int days = Integer.parseInt(list[1]);
        if (type.equals("S")){
            Standard room = new Standard(days);
            System.out.println((int)(room.getPrice()));
        } else {
            VIP room = new VIP(days);
            System.out.println((int)(room.getPrice()));
        }
    }
}
