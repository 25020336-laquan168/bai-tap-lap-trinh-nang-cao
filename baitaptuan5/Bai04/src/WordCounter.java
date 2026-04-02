import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> map = new HashMap<>();
    public void analyze(String text){
        text = text.toLowerCase();
        String ans = "";
        for (int i = 0; i < text.length(); i++){
            if (Character.isAlphabetic(text.charAt(i)) || text.charAt(i) == ' '){
                ans += text.charAt(i);
            }
        }

        String[] arr = ans.trim().split(" ");
        for (String x : arr){
            if (map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
    }

    public void displayResult(){
        String maxW = "";
        int maxC = 0;
        for (String x : map.keySet()){
            System.out.println("Từ: " + x + " đã xuất hiện " + map.get(x) + " lần");
            if (map.get(x) > maxC){
                maxC = map.get(x);
                maxW = x;
            }
        }
        System.out.println();
        System.out.println("Từ xuất hiện nhiều nhất là: " + maxW);
    }
}
