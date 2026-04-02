import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> arr = new ArrayList<>();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] list = line.split(" ");

            String type = list[0];
            String name = list[1];
            double salary = Double.parseDouble(list[2]);

            if (type.equals("E")){
                arr.add(new Employee(name, salary));
            } else if (type.equals("D")){
                int overtimeHours = Integer.parseInt(list[3]);
                arr.add(new Developer(name, salary, overtimeHours));
            } else {
                int bugs = Integer.parseInt(list[3]);
                arr.add(new Tester(name, salary, bugs));
            }
        }

        for (Employee e : arr){
            double bonus  = e.calculateBonus();
            System.out.println(e.getName() + " - Bonus: " + bonus);

            if (e instanceof Developer){
                System.out.println("Tặng khoá học AWS");
            }
            if (e instanceof Tester){
                System.out.println("Tặng tool Test");
            }
        }
    }
}
