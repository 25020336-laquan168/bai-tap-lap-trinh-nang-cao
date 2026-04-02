import java.util.ArrayList;

public class LibraryArrayList {
    ArrayList<Book> lib;
    public LibraryArrayList(){
        lib = new ArrayList<>();
    }

    public void addBook(Book x){
        lib.add(x);
        System.out.println("Sách " + x.getTitle() + " đã được thêm vào thư viện!");
    }

    public Book findBookById(String id){
        for(Book x : lib){
            if(x.getId().equals(id)){
                System.out.println("Sách có id " + id + " đã được tìm thấy");
                return x;
            }
        }
        return null;
    }

    public void removeBookById(String id){
        for (Book x : lib){
            if (x.getId().equals(id)){
                lib.remove(x);
                System.out.println("Sách có id " + id + " đã bị xoá!");
                break;
            }
        }
    }

    public void printLib(){
        if (lib.isEmpty()) {
            System.out.println("Thư viện không có quyển sách nào!");
        } else {
            for (Book x : lib){
                System.out.println(x);
            }
        }

    }
}
