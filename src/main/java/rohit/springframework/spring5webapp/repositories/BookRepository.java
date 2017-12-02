package rohit.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rohit.springframework.spring5webapp.model.Book;

/**
 * Created by RJ
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
