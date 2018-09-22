package com.did.controller;

import com.did.domain.Author;
import com.did.domain.Post;
import com.did.repository.AuthorRepository;
import com.did.service.AuthorService;
import com.did.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    PostService postService;
    AuthorService authorService;

    @Autowired
    public PostController(PostService postService,AuthorService authorService) {
        this.postService = postService;
        this.authorService = authorService;
    }

    @RequestMapping("/latestpost")
    public Post latestPost(){
        return postService.getLatest();
    }
    @RequestMapping("/author")
    public Iterable<Author> latesstPost(){
        return authorService.getAllPosts();
    }
}
