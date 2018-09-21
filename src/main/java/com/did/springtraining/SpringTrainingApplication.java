package com.did.springtraining;

import com.did.domain.Post;
import com.did.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(value = "com.did")
@EnableConfigurationProperties
@EntityScan("com.did.domain")
@EnableJpaRepositories("com.did.repository")

public class SpringTrainingApplication {

    @Autowired
    PostRepository postRepository;

    public static void main(String[] args) {


        SpringApplication.run(SpringTrainingApplication.class, args);

//		MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
//		System.out.println(ctx.getBean("mydatasource").toString());
    }

    @PostConstruct
    void seePosts() {
        for(Post post: postRepository.findAll())
        System.out.println(post.toString());
    }
}
