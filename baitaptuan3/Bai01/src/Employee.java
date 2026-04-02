public class Employee extends Person{
    double salary;
    public Employee(){
        super("Quan");
        System.out.println("2. Employee is created");
    }
    // Bởi vì lớp cơ sở không có constructor mặc định, ta bắt buộc phải gọi constructor của lớp cơ sở một cách tường minh.
}
