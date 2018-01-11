package com.smar.assetview.bootstrap;

import com.smar.assetview.model.Author;
import com.smar.assetview.model.Book;
import com.smar.assetview.model.Publisher;
import com.smar.assetview.repositories.AuthorRepository;
import com.smar.assetview.repositories.BookRepository;
import com.smar.assetview.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher hcPublisher = new Publisher();
        hcPublisher.setName("Harper Collins");

        publisherRepository.save(hcPublisher);

        Publisher worxPublisher = new Publisher();
        worxPublisher.setName("Worx");

        publisherRepository.save(worxPublisher);

        Author eric = new Author("Eric", "Evans");
        Author rod = new Author("Rod", "Johnson");

        authorRepository.save(eric);
        authorRepository.save(rod);

        Book ddd = new Book("Domain Driven Design", "1234", hcPublisher);
        Book noEJB = new Book("J2EE Development without EJB", "2345", worxPublisher);

        eric.getBooks().add(ddd);
        rod.getBooks().add(noEJB);

        bookRepository.save(ddd);
        bookRepository.save(noEJB);
    }
}
