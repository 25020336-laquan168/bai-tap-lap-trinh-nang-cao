public class Developer extends Employee{
    int overtimeHours;

    public Developer(String _name, double _baseSalary ,int _overtimeHours){
        super(_name, _baseSalary);
        baseSalary = _baseSalary;
        overtimeHours = _overtimeHours;
    }

    public double calculateBonus(){
        return 0.1 * baseSalary + 200000 * overtimeHours;
    }
}
