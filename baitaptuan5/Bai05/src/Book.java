public class Book {
    String id;
    String title;
    String author;
    int year;

    public Book(String _id, String _title, String _author, int _year){
        id =_id;
        title = _title;
        author = _author;
        year = _year;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return id + " - " + title + " - " + author + " - " + year;
    }
}
