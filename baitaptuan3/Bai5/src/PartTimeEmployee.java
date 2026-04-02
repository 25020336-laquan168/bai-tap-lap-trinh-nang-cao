public class PartTimeEmployee extends Employee{
    private double workingHours;
    private double hourlyRate;
    public PartTimeEmployee(String _name, double _workingHours, double _hourlyRate){
        super(_name);
        workingHours = _workingHours;
        hourlyRate = _hourlyRate;
    }

    double tinhluong(){
        return workingHours * hourlyRate;
    }

    String type(){
        return "PartTime";
    }
}
