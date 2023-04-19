package demo.repository;

import demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
        extends MongoRepository<Book, Integer> {
}
