import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String outputFile = sc.nextLine();
        int n = sc.nextInt();
        try {
            try {
                FileOutputStream outputStream = new FileOutputStream(outputFile);
                DataOutputStream output = new DataOutputStream(outputStream);

                while (n-- > 0) {
                    output.writeInt(sc.nextInt());
                }

                output.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

            try {
                FileInputStream inputStream = new FileInputStream(outputFile);
                DataInputStream input = new DataInputStream(inputStream);

                while (true) {
                    System.out.println(input.readInt());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (EOFException e) {
                System.out.println("Đã đọc hết file");
            }
        }
        catch (IOException e){
            System.out.println("giá trị không hợp lệ");
        }
    }
}
