public class Electronics extends Product{
    private double baohanh;

    public Electronics(String _id, String _name, double _baseprice ,double _baohanh){
        super(_id, _name, _baseprice);
        baohanh = _baohanh;
    }

    public double getFinalPrice(){
        return (baseprice * 1.1) + baohanh;
    }

    public String getType(){
        return "Electronics";
    }
}
