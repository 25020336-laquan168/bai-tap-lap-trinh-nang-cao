import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        sc.nextLine();

        for (int i = 0; i < n; i ++){
            String line = sc.nextLine();
            String[] lst = line.trim().split(" ");
            String type = lst[0];
            String id = lst[1];
            String name = lst[2];

            if (type.equals("O")){
                double baseSalary = Double.parseDouble(lst[3]);
                arr[i] = new OfficeWorker(id, name, baseSalary);
            } else {
                double baseSalary = Double.parseDouble(lst[3]);
                int overtimeHours = Integer.parseInt(lst[4]);
                arr[i] = new Technician(id, name, baseSalary, overtimeHours);
            }
        }

        for (Employee e : arr){
            if (e instanceof OfficeWorker){
                System.out.println(e.name + " - Pay: " + e.caculatePay());
                e.work();
                System.out.println();
                total += e.caculatePay();
            }
            if (e instanceof Technician){
                System.out.println(e.name + " - Pay: " + e.caculatePay());
                e.work();
                System.out.println();
                total += e.caculatePay();
            }
        }
        System.out.print("Total Pay = ");
        System.out.printf("%.1f", total);
    }
}
