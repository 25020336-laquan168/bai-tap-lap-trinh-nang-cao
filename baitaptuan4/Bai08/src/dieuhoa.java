public class dieuhoa extends thietbi implements ketnoiwifi{
    public dieuhoa(String _id, String _name){
        super(_id, _name);
    }

    public void ketnoi(){
        System.out.println(name + " connected to wifi");
    }
}
