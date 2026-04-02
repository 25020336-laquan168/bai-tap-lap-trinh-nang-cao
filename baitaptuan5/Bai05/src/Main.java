public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("01", "cach lam nguoi", "Nguyen Duc Tam", 2007);
        Book b2 = new Book("02", "cach lam tien si", "Nguyen Minh Thai Son", 2008);
        Book b3 = new Book("03", "cach lam bac si", "Vu Dinh Manh", 2009);
        Book b4 = new Book("04", "cach lam gay", "Nguyen Van Tien", 2010);
        Book b5 = new Book("05", "cach lam Lebron James", "Ha Dinh Tuan", 2011);
        System.out.println();

        System.out.println("Quản lý bằng ArrayList:");
        LibraryArrayList lib1 = new LibraryArrayList();
        lib1.addBook(b3);
        lib1.addBook(b2);
        lib1.addBook(b1);
        lib1.addBook(b5);
        lib1.addBook(b4);
        System.out.println("Danh sách sách trong thư viện:");
        lib1.printLib();
        System.out.println("Tìm sách có id 01:");
        lib1.findBookById("01");
        System.out.println("Xoá sách có id 02:");
        lib1.removeBookById("02");
        System.out.println("Danh sách sách còn lại trong thư viện:");
        lib1.printLib();
        System.out.println();

        System.out.println("Quản lý bằng HashMap:");
        LibraryHashMap lib2 = new LibraryHashMap();
        lib2.addBook(b3);
        lib2.addBook(b2);
        lib2.addBook(b1);
        lib2.addBook(b5);
        lib2.addBook(b4);
        System.out.println("Danh sách sách trong thư viện:");
        lib2.printLib();
        System.out.println("Tìm sách có id 01:");
        lib2.findBookById("01");
        System.out.println("Xoá sách có id 02:");
        lib2.removeBookById("02");
        System.out.println("Danh sách sách còn lại trong thư viện:");
        lib2.printLib();
        System.out.println();

        System.out.println("Quản lý bằng HashMap:");
        LibraryTreeMap lib3 = new LibraryTreeMap();
        lib3.addBook(b3);
        lib3.addBook(b2);
        lib3.addBook(b1);
        lib3.addBook(b5);
        lib3.addBook(b4);
        System.out.println("Danh sách sách trong thư viện:");
        lib3.printLib();
        System.out.println("Tìm sách có id 01:");
        lib3.findBookById("01");
        System.out.println("Xoá sách có id 02:");
        lib3.removeBookById("02");
        System.out.println("Danh sách sách còn lại trong thư viện:");
        lib3.printLib();
    }
}

/*
Độ phức tạp khi tìm kiếm:
    + ArrayList: O(n)
    + HashMap: O(1)
    + TreeMap: O(log n) tìm theo cây đỏ đen.
Cấu trúc dữ liệu phù hợp với:
    + Số lượng sách nhỏ: ArrayList: vì dễ cài đặt, dễ hiểu, không cần quá nhiều về hiệu năng.
    + Số lượng sách rất lớn: HashMap: tìm kiếm nhanh, xoá nhanh, phù hợp với số lượng sách lớn, cần hiệu năng cao.
    + Dữ liệu cần được sắp xếp theo id: TreeMap: sẽ được sắp xếp theo id, theo thứ tự id tăng dần
Vì sao HashMap thường tìm kiếm nhanh hơn so với ArrayList: vì HashMap có thể truy cập trực tiếp phần tử thông qua id,
    còn ArrayList thì sẽ phải duyệt hết lib mới tìm được cuốn sách cần tìm.
 */
