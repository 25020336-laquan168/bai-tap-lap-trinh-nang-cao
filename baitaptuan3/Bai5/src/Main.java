import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] company = new Employee[n];
        for (int i = 0 ; i < n; i ++){
            String line = sc.nextLine();
            char type = line.charAt(0);
            int dau = line.indexOf('"');
            int cuoi = line.lastIndexOf('"');
            String name = line.substring(dau + 1, cuoi);
            String[] conlai = line.substring(cuoi + 1).trim().split(" ");

            if (type == 'F'){
                double baseSalary = Double.parseDouble(conlai[0]);
                double bonus = Double.parseDouble(conlai[1]);
                double penalty = Double.parseDouble(conlai[2]);

                company[i] = new FullTimeEmployee(name, baseSalary, bonus, penalty);
            } else {
                double workingHours = Double.parseDouble(conlai[0]);
                double hourlyRate = Double.parseDouble(conlai[1]);

                company[i] = new PartTimeEmployee(name, workingHours, hourlyRate);
            }
        }
        for(Employee e : company){
            System.out.println(e.getName() + " - " + e.type() + " - " + e.tinhluong());
        }
    }
}
