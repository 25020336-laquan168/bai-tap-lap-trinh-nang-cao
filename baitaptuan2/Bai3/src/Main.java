public class Main {
    public static void swap(NumberWrapper a, NumberWrapper b) {
        int tmp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(tmp);
    }
    public static void main(String[] args) {
        NumberWrapper a = new NumberWrapper();
        a.setValue(5);
        NumberWrapper b = new NumberWrapper();
        b.setValue(10);
        swap(a, b);
        System.out.println("gia tri cua a la: " + a.getValue());
        System.out.println("gia tri cua b la: " + b.getValue());
    }
}
