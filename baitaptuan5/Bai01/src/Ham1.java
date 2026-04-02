public class Ham1 {
    public static void main(String[] args) {
        String str1 = new String();
        for (int i = 0; i < 100000; i++){
            str1 = str1.concat("hello");
        }
        System.out.println(System.currentTimeMillis());
    }
}
