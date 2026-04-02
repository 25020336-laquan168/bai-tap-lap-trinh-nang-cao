public class Tester extends Employee{
    int bugsFound;

    public Tester(String _name, double _baseSalary, int _bugsFound){
        super(_name, _baseSalary);
        baseSalary = _baseSalary;
        bugsFound = _bugsFound;
    }

    @Override
    public double calculateBonus() {
        return (baseSalary * 0.1) + (50000 * bugsFound);
    }
}
