import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        String output = sc.nextLine();
        int sodong = 0;

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        // phải khởi tạo trước để có thể gọi đóng ở finally.
        try{
            FileReader fileReader = new FileReader(input);
            bufferedReader = new BufferedReader(fileReader);
            // đọc và lưu vào đệm.
            FileWriter fileWriter = new FileWriter(output);
            printWriter = new PrintWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line);
                sodong += 1;
            }
            System.out.println("Đã copy thành công!");
            System.out.println("Số dòng:" + sodong);
        }
        catch (FileNotFoundException e){
            System.out.println("Source file note found.");
        }
        catch (IOException e){
            System.out.println("I/O error");
        }
        finally{
            if (printWriter != null) {
                printWriter.close();
                // tương tự như của bufferedReader.
            }
            try{
                if (bufferedReader != null) {
                    bufferedReader.close();
                    // phải kiểm tra vì: nếu không có file, việc khởi tạo bufferedReader sẽ không xảy ra, thì nó sẽ vẫn mang giá trị null, khi đó nếu mình gọi close thì sẽ báo lỗi vì không có đối tượng nào được trỏ đến.
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
                // vì close có thể ném ra IOexception nên cần try - catch.
            }
        }
    }
}
//Bai07/src/inputFile
//Bai07/src/outputFile
