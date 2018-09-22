package com.did.service;

import com.did.domain.Post;
import com.did.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatest(){
        Post latestPost =  postRepository.findFirstByOrderByPostedOnDesc();
        latestPost.getAuthor().setPosts(null);
        return latestPost;
    }

}
