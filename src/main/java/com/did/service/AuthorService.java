package com.did.service;

import com.did.domain.Author;
import com.did.domain.Post;
import com.did.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;
    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> getAllPosts(){
        Iterable<Author> authors = authorRepository.findAll();
        for (Author author:authors){
            for(Post post:author.getPosts()){
                post.setAuthor(null);
            }
        }
        return authors;
    }
}
