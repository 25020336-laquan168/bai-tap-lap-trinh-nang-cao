public class Ham2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i ++){
            str.append("hello");
        }
        System.out.println(System.currentTimeMillis());
    }
}
