package rohit.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rohit.springframework.spring5webapp.model.Author;

/**
 * Created by RJ
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}

