package hw4;

public interface BookRepository {
    Book findById(String id);

    Book findAll();
}
