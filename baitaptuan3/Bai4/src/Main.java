public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
//        Cat c = (Cat) a;
//        c.makeSound();
        //javac biên dịch thành công
        // khi chạy chương trình java thì sẽ báo lỗi, lỗi là: java.lang.ClassCastException.
        // lỗi xảy ra vì a đang là đối tượng Dog, khi bạn cố gắng ép kiểu nó thành đối tượng Cat, sẽ không thể ép kiểu được.
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.makeSound();
        } else {
            System.out.println("Đây không phải là Mèo!");
        }
    }
}
