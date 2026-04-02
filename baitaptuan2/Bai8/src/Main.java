public class Main {
    public static void main(String[] args) {
        Person p = new Person("La Quan");
        p.setMe(p);
        System.out.println("ten khi ta dung phuong thuc getMe qua tham chieu me: " + p.getMe().getName());
        p = null;
    }
}
