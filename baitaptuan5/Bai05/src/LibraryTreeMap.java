import java.util.TreeMap;

public class LibraryTreeMap {
    TreeMap<String, Book> lib;

    public LibraryTreeMap(){
        lib = new TreeMap<>();
    }

    public void addBook(Book x){
        lib.put(x.getId(), x);
    }

    public Book findBookById(String id){
        System.out.println("Sách có id " + id + " đã được tìm thấy");
        return lib.get(id);
    }

    public void removeBookById(String id){
        lib.remove(id);
        System.out.println("Sách có id " + id + " đã bị xoá!");
    }

    public void printLib(){
        if (lib.isEmpty()){
            System.out.println("Thư viện không có quyển sách nào!");
        } else {
            for (String x : lib.keySet()){
                System.out.println(lib.get(x));
            }
        }
    }
}
