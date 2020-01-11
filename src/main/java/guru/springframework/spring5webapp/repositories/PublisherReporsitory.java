package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author Jolie
 * @Date 1/11/20
 */
public interface PublisherReporsitory extends CrudRepository<Publisher, Long> {
}
