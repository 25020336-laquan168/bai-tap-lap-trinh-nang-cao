public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("100 cach lam giau", "ductamdeptrai", 250);
        Book book2 = new Book("100 cach lam giau", "ductamdeptrai", 250);
        //so sanh ==
        System.out.println("book1 == book2: " + (book1 == book2));
        //so sanh equals
        System.out.println("book1.equals(book2): " + (book1.equals(book2)));
    }
}
