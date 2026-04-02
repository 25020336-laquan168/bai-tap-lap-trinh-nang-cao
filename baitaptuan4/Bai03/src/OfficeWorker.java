public class OfficeWorker extends Employee{
    public OfficeWorker(String _id, String _name, double _baseSalary){
        id = _id;
        name = _name;
        baseSalary = _baseSalary;
    }

    public double caculatePay(){
        return baseSalary;
    }

    public void work(){
        System.out.println("Soạn thảo văn bản");
    }
}
