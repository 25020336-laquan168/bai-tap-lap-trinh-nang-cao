public abstract class thietbi {
    protected String id;
    protected String name;
    protected Boolean trangthai;

    public thietbi(String _id, String _name){
        id = _id;
        name = _name;
        trangthai = true;
    }

    public void on(){
        trangthai = true;
        System.out.println(name + " turned on");
    }
    public void off(){
        trangthai = false;
        System.out.println(name + " turned off");
    }

    public String getName(){
        return name;
    }
}
