public class FullTimeEmployee extends Employee{
    private double baseSalary;
    private double bonus;
    private double penalty;
    public FullTimeEmployee(String _name, double _baseSalary, double _bonus, double _penalty){
        super(_name);
        baseSalary = _baseSalary;
        bonus = _bonus;
        penalty = _penalty;
    }

    double tinhluong(){
        return baseSalary + (bonus - penalty);
    }

    String type(){
        return "Fulltime";
    }
}
