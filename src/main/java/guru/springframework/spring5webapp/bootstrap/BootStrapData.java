package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherReporsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author Jolie
 * @Date 2/10/20
 */

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherReporsitory publisherReporsitory;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherReporsitory publisherReporsitory) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherReporsitory = publisherReporsitory;
    }

    @Override
    public void run(String... args) throws Exception{
        //initial publisher
        Publisher publisher = new Publisher("foo","12th Street, LA");

        publisherReporsitory.save(publisher);


        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        Book hp = new Book("Harry Potter", "11213", publisher);
        eric.getBooks().add(ddd);
        eric.getBooks().add(hp);

        ddd.getAuthors().add(eric);
        hp.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        bookRepository.save(hp);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Start CommandLineRunner in BootStrap");
        System.out.println("num of books in repositories" + bookRepository.count());
    }
}
