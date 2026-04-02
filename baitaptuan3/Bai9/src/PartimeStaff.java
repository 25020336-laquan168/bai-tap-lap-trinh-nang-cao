public class PartimeStaff extends Staff{
    int workinghours;
    double hourlyRate;

    public PartimeStaff(String _id, String _name, int _workinghours, double _hourlyRate){
        super(_id, _name);
        workinghours = _workinghours;
        hourlyRate = _hourlyRate;
    }

    public double getPaymentAmount(){
        return workinghours * hourlyRate;
    }

}
