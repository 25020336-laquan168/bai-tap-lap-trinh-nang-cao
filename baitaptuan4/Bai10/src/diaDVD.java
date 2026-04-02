public class diaDVD extends MediaItem{
    protected String daodien;
    protected int thoiluong;

    public diaDVD(String id, String name, String daodien, int thoiluong){
        super(id, name);
        this.daodien = daodien;
        this.thoiluong = thoiluong;
    }

    public void info(){
        System.out.println(name + " - " + daodien + " - " + thoiluong);
    }
}
