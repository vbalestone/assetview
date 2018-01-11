package com.smar.assetview.repositories;

import com.smar.assetview.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
