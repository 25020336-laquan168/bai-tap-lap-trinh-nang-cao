public class den extends thietbi implements dieuchinh{
    protected int dosang;

    public den(String id, String name){
        super(id, name);
        dosang = 50;
    }

    public void tang(){
        dosang += 10;
    }

    public void giam(){
        dosang -= 10;
    }
}
