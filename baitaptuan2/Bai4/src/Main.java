public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("La Quan", new MyDate(1, 1 , 2000));
        Employee emp2 = new Employee(emp1);
        emp1.changebirthday(new MyDate(2, 2, 2022));
        emp1.showbirthday();
        emp2.showbirthday();
    }
}
