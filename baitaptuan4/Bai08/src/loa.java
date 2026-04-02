public class loa extends thietbi implements ketnoiwifi, dieuchinh {
    private int volume;

    public loa(String _id, String _name){
        super(_id, _name);
        volume = 50;
    }

    public void ketnoi(){
        System.out.println(name + " connected to wifi");
    }

    public void tang(){
        volume += 10;
    }

    public void giam(){
        volume -= 10;
    }
}
