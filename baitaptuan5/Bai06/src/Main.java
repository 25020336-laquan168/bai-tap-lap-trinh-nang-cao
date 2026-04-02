import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("a / b = " + a / b);
        }
        catch (InputMismatchException e){
            System.out.println("Giá trị nhập vào không hợp lệ");
        }
        catch (ArithmeticException e){
            System.out.println("Không thể chia cho số không");
        }
        finally{
            System.out.println("Program finished");
        }

    }
}
