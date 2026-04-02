public class dodientu extends Product{
    private String thoigianbh;

    public dodientu(String id, String name, String _thoigianbh){
        super(id, name);
        thoigianbh = _thoigianbh;
    }

    public void Info(){
        System.out.println(name + " - " + thoigianbh + " tháng bảo hành");
    }
}
