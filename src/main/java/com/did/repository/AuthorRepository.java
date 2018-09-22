package com.did.repository;

import com.did.domain.Author;
import com.did.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
