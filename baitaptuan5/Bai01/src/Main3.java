import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int socau = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        StringBuffer line = new StringBuffer(x);

        if (!line.isEmpty()) {
            socau++;
        }
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == '!'){
                socau++;
            }
        }

        System.out.println("số câu là: " + socau);

        while (true){
            flag = false;
            if (line.indexOf("Java") != -1) {
                int id = line.indexOf("Java");
                line.replace(id, id + 4, "Python");
                flag = true;
            }
            if (!flag){
                break;
            }

        }
        System.out.println(line);
    }
}
