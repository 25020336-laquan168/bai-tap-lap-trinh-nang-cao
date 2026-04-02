public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pa1 = new Pair<String, Integer>("Tuổi", 20);
        Pair<String, String> pa2 = new Pair<String, String>("Mã SV", "SV001");
        Pair<Integer, Double> pa3 = new Pair<Integer, Double>(105, 21.5);

//        Pair<Integer, Integer> pa4 = new Pair<Integer, Integer>("La Quan", "dep trai");

        System.out.println(pa1.showinfo());
        System.out.println(pa2.showinfo());
        System.out.println(pa3.showinfo());
    }
}
