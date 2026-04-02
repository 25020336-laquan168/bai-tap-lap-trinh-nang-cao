public class Sach extends MediaItem{
    protected String tacgia;
    protected int sotrang;

    public Sach(String id, String name, String tacgia, int sotrang){
        super(id, name);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    public void info(){
        System.out.println(name + " - " + tacgia + " - " + sotrang);
    }
}
