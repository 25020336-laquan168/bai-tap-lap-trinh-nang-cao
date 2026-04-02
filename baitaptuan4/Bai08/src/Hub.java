import java.util.ArrayList;

public class Hub {
    private ArrayList<thietbi> arr;

    public Hub(){
        arr = new ArrayList<>();
    }

    public void themthietbi(thietbi x){
        arr.add(x);
    }

    public void tat(){
        System.out.println("Turn Off All Devices:");
        for (thietbi x : arr){
            x.off();
        }
    }

    public void ketnoi(){
        System.out.println("Setup Wifi:");
        for (thietbi x : arr){
            if (x instanceof ketnoiwifi){
                ((ketnoiwifi) x).ketnoi();
            }
        }
    }
}
