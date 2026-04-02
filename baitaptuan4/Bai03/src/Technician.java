public class Technician extends Employee{
    protected int overtimeHours;

    public Technician(String _id, String _name, double _baseSalary, int _overtimeHours){
        id = _id;
        name = _name;
        baseSalary = _baseSalary;
        overtimeHours = _overtimeHours;
    }

    public void work(){
        System.out.println("Lắp đặt thiết bị");
    }

    public double caculatePay(){
        return baseSalary + overtimeHours * 20000;
    }
}
