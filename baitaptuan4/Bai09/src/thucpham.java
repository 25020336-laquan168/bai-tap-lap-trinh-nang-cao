public class thucpham extends Product{
    private String hansudung;

    public thucpham(String id, String name, String _hansudung){
        super(id, name);
        hansudung = _hansudung;
    }

    public void Info(){
        System.out.println(name + " - " + hansudung);
    }
}
