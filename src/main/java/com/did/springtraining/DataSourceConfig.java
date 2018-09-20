package com.did.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class DataSourceConfig {
    @Bean(name="mydatasource")
    @Profile("development")
    DataSource myDevDataSource(){
        return new DataSource("my-dev-url",9999);
    }

    @Bean(name="mydatasource")
    @Profile("production")
    DataSource myProdDataSource(){
        return new DataSource("my-prod-url",9999);
    }
}
