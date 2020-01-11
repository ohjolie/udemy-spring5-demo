package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author Jolie
 * @Date 1/9/20
 */
public interface BookRepository extends CrudRepository <Book,Long>  {
}
