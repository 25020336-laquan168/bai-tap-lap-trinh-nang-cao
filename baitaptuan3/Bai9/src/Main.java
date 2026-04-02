import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IPayable[] payablelist = new IPayable[n];
        sc.nextLine();

        for (int i = 0; i < n; i ++) {
            String line = sc.nextLine();
            String[] arr = line.trim().split(" ");
            String type = arr[0];

            if (type.equals("S")) {
                String id = arr[1];
                String name = arr[2];
                int workinghours = Integer.parseInt(arr[3]);
                double hourlyRate = Double.parseDouble(arr[4]);

                payablelist[i] = new PartimeStaff(id, name, workinghours, hourlyRate);
            } else {
                String itemName = arr[1];
                int quantity = Integer.parseInt(arr[2]);
                double price = Double.parseDouble(arr[3]);

                payablelist[i] = new Invoice(itemName, quantity, price);
            }
        }
        for (IPayable x : payablelist) {
            double amount = x.getPaymentAmount();
            total += amount;
            if (x instanceof PartimeStaff){
                PartimeStaff s = (PartimeStaff) x;
                System.out.println("PartTimeStaff " + s.getName() + " - Payment: " + s.getPaymentAmount());
            }
            if (x instanceof Invoice) {
                Invoice s = (Invoice) x;
                System.out.println("Invoice " + s.getItemName() + " - Payment: " + s.getPaymentAmount());
            }
        }
        System.out.println("Total Payment = " + total);
    }
}
