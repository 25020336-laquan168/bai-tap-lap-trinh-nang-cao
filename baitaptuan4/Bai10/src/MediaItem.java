public abstract class MediaItem {
    protected String id;
    protected String name;

    public MediaItem(String _id, String _name){
        id = _id;
        name = _name;
    }

    public String getName(){
        return name;
    }

    public abstract void info();
}
