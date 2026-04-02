public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String _title, String _author, double _price){
        title = _title;
        author = _author;
        price = _price;
    }
    public boolean equals(Object obj){
        Book khac = (Book) obj;
        if (this.title == khac.title && this.author == khac.author && this.price == khac.price){
            return true;
        } else {
            return false;
        }
    }
}
