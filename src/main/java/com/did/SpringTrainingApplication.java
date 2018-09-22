package com.did;

import com.did.domain.Post;
import com.did.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringTrainingApplication {

    @Autowired
    PostRepository postRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringTrainingApplication.class, args);

//		MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
//		System.out.println(ctx.getBean("mydatasource").toString());
    }
}
