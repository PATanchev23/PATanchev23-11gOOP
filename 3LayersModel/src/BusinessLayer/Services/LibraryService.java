package BusinessLayer.Services;

import DataAccessLayer.Repositories.BookRepository;

public class LibraryService {
    private BookRepository repository;
    public LibraryService(BookRepository repository) {
        this.repository = repository;
    }
        public boolean IsBookAvailable(int bookId){
            return repository.IsAvailable(bookId);
    }
}
