package DataAccessLayer.Repositories;
import DataAccessLayer.Models.Book;
import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books;
    public BookRepository() {
        books = new ArrayList<>();
    }
    //Добавяне на книга
    public void addBook(Book book) {
        books.add(book);
    }
    //Връщане на книга
    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    // Търсене на книга
    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Object IsAvailable(int bookId) {
        return null;
    }
}
