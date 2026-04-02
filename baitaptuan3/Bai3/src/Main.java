public class Main {
    public static void main(String[] args) {
        MathUtils m = new AdvancedMath();
        // m được khai báo đa hình, dù được khai báo kiểu MathUtils nhưng lại tham chiếu đến AdvancedMath, tức là tạo một đối tượng AdvancedMath.
        // kiểu lớp cha nhưng được khai báo là đối tượng lớp con
        System.out.println(m.sum(5, 5)); // A
//        System.out.println(m.sum(5.5, 5.5)); // B
        // Kết quả dòng A in ra 20 vì phương thức sum đã được ghi đè lại trong AdvancedMath là a + b + 10.
        // Khi chạy thì sẽ chỉ nhìn vào kiểu có hàm nào, có bị override trong đối tượng được tham chiếu đến hay không,nên trong trường hợp này không có phương thức sum(double, double) trong đối tượng MathUtils nên Java sẽ báo lỗi khi chạy compile.


    }
}
