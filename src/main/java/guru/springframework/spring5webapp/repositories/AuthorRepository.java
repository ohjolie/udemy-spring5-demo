package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author Jolie
 * @Date 1/9/20
 */
public interface AuthorRepository extends CrudRepository <Author, Long> {
}
