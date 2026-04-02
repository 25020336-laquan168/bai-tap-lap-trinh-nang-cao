import java.util.ArrayList;

public class kho<T extends Product> {
    private ArrayList<T> sp;

    public kho(){
        sp = new ArrayList<>();
    }

    public void nhaphang(T x){
        sp.add(x);
    }

    public void xuatkho(){
        for (T x : sp){
            System.out.println(x.getName() + " da xuat kho");
            sp.remove(x);
        }
    }

    public void kiemke(){
        for (T x : sp){
            x.Info();
        }
    }
}
