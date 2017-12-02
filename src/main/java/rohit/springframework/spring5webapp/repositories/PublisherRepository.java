package rohit.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rohit.springframework.spring5webapp.model.Publisher;

/**
 * Created by RJ
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
