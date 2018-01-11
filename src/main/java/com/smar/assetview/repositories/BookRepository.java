package com.smar.assetview.repositories;

import com.smar.assetview.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
