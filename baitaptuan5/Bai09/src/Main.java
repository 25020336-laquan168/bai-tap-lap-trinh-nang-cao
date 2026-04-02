import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "Bai09/src/Students.bin";
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try{
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            while (sc.hasNext()){
                String line = sc.nextLine();
                if (line.equals("END")){
                    throw new EOFException();
                }
                String[] arr = line.trim().split(" ");
                String id = arr[0];
                String name = arr[1];
                double gpa = Double.parseDouble(arr[2]);
                Student cur = new Student(id, name, gpa);
                oos.writeObject(cur);
            }
            oos.close();
        }
        catch (EOFException e){
            System.out.println("Đã hết học sinh");
        }
        catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        }
        catch (IOException e){
            System.out.println("Dữ liệu nhập vào không hợp lệ");
        }

        try{
            Student curobj = null;
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            while (true){
                curobj = (Student) ois.readObject(); //trả về object nên phải cast nó về student
                System.out.println(curobj);
            }
        }
        catch (EOFException e){
            System.out.println("Đã hết file");
        }
        catch (IOException e){
            System.out.println("Dữ liệu được đọc không hợp lệ");
        } catch (ClassNotFoundException e){
            System.out.println("Không tìm thấy class Student");
        }
    }
}
