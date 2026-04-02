import java.util.ArrayList;

public class librarysection<T extends MediaItem> {
    protected ArrayList<T> items;

    public librarysection(){
        items = new ArrayList<>();
    }

    public void themtailieu(T x){
        items.add(x);
    }

    public void xoatailieu(T x){
        System.out.println(x.getName() + " da bi xoa!");
        items.remove(x);
    }

    public void dstailieu(){
        for (T x : items){
            x.info();
        }
    }
}
