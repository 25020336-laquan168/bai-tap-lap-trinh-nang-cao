import java.time.LocalDate;

public class Food extends Product{
    private LocalDate hansudung;

    public Food(String _id, String _name, double _baseprice, LocalDate _hansudung){
        super(_id, _name, _baseprice);
        hansudung = _hansudung;
    }

    public double getFinalPrice(){
        LocalDate today = LocalDate.now();
        LocalDate sau7ngay = today.plusDays(7);
        if ((today.isBefore(hansudung) && sau7ngay.isAfter(hansudung)) || today.isEqual(hansudung)){
            return baseprice * 0.8;
        } else {
            return baseprice;
        }
    }

    public String getType(){
        return "Food";
    }
}
