import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuffer ans = new StringBuffer();
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++){
            char x = line.charAt(i);
            if (Character.isAlphabetic(x) || x == ' '){
                ans.append(x);
            }
        }

        System.out.println(ans);
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        String[] arr = (ans.toString()).trim().split(" ");

        for (String x : arr){
            if (count.containsKey(x)){
                count.put(x, count.get(x) + 1);
            } else {
                count.put(x, 1);
            }
        }
        String maxW = "";
        int maxC = 0;

        for (String x : count.keySet()){
            if (count.get(x) == 1){
                System.out.println(x);
            }

            if (count.get(x) > maxC){
                maxC = count.get(x);
                maxW = x;
            }
        }

        System.out.println("Từ xuất hiện nhiều nhất là: " + maxW);
    }
}
