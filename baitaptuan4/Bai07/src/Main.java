import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>(n);
        sc.nextLine();

        for (int i = 0; i < n; i ++){
            String line = sc.nextLine();
            String[] lst = line.trim().split(" ");
            String id = lst[0];
            String name = lst[1];
            double gpa = Double.parseDouble(lst[2]);
            Student stu1 = new Student(id, name, gpa);
            arr.add(stu1);
        }

        arr.removeIf(x -> x.getGpa() < 5.0);
        // gọi lên hàm removeIf có sẵn của ArrayList, rồi sau đó truyền cho nó một điều kiện (lambda).
        System.out.println("After removing GPA < 5.0:");
        for (Student x : arr){
            System.out.println(x.getInfo());
        }

        System.out.println();

        arr.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorting by name:");
        for (Student x : arr){
            System.out.println(x.getInfo());
        }

//        Operation<Double> cong = (a, b) -> a + b;
//        Operation<Double> tru = (a, b) -> a - b;
//        Operation<Double> nhan = (a, b) -> a * b;
//        Operation<Double> chia = (a, b) -> a / b;

        //ta hiểu được rẳng, cong tru nhan chia là các object kiểu Operation Double, và các object này chỉ có duy nhất 1 method execute, và ta gán method đó bằng lambda
        //lambda chính là tạo 1 object kiểu Operation<T>, và gán method execute với cộng trừ nhân chia theo bạn khai báo.
//
//        System.out.println("Operations with lambda:");
//        System.out.println("10.0 + 5.0 = " + cong.execute(10.0, 5.0));
//        System.out.println("10.0 - 5.0 = " + tru.execute(10.0, 5.0));
//        System.out.println("10.0 * 5.0 = " + nhan.execute(10.0, 5.0));
//        System.out.println("10.0 / 5.0 = " + chia.execute(10.0, 5.0));
    }
}
