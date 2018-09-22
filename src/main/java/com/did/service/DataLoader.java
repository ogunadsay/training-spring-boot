package com.did.service;

import com.did.domain.Author;
import com.did.domain.Post;
import com.did.repository.AuthorRepository;
import com.did.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {
    private AuthorRepository authorRepository;
    private PostRepository postRepository;

    @Autowired
    public DataLoader(AuthorRepository authorRepository, PostRepository postRepository) {
        this.authorRepository = authorRepository;
        this.postRepository = postRepository;
    }

//    @PostConstruct
//    void loadData(){
//        //create an author
//        Author author = new Author("Ogün","Adsay");
//        authorRepository.save(author);
//
//        //create posts
//        Post post = new Post("Spring data rocks");
//        post.setBody("post boyd here");
//        post.setPostedOn(new Date());
//        post.setAuthor(author);
//        postRepository.save(post);
//    }
}
