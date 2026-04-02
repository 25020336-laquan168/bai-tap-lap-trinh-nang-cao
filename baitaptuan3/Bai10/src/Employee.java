public class Employee {
    String name;
    double baseSalary;

    public Employee(String _name, double _baseSalary){
        name = _name;
        baseSalary = _baseSalary;
    }

    public double calculateBonus(){
        return baseSalary * 0.1;
    }

    public String getName(){
        return name;
    }

}
