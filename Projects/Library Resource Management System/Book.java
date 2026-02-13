public class Book extends LibraryResource{
    
    String title;
    String author;
    String isbn;

    @Override
    public String getDetails(){
        return "Book: " + title + "Author: " + author + "ISBN: " + isbn;
    }

    public Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

