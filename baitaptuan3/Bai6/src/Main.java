import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] orders = new Product[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            char type = line.charAt(0);
            int dau = line.indexOf('"');
            int cuoi = line.lastIndexOf('"');
            String name = line.substring(dau + 1, cuoi);

            String[] conlai = line.substring(cuoi + 1).trim().split(" ");

            if (type == 'E') {
                double base = Double.parseDouble(conlai[0]);
                double baohanh = Double.parseDouble(conlai[1]);
                orders[i] = new Electronics("san pham" + i, name, base, baohanh);
            } else {
                double base = Double.parseDouble(conlai[0]);
                LocalDate date = LocalDate.parse(conlai[1]);
                orders[i] = new Food("san pham" + i, name, base, date);
            }
        }

        for (Product e : orders) {
            System.out.println(e.getName() + " - " + e.getType() + " - " + e.getFinalPrice());
            total += e.getFinalPrice();
        }
        System.out.println("Total = " + total);
    }
}


//3
//E "Laptop" 1000 50
//F "Milk" 30 2026-03-29
//F "Bread" 20 2026-03-20
