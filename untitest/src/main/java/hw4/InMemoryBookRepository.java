package hw4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> books;

    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));
    }

    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    @Override
    public Book findAll() {
        return new ArrayList<>(books.values());
    }
}
