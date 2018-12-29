package com.mzbloc.mongo;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * Created by tanxw on 2018/12/12.
 */
@Configuration
@EnableMongoRepositories
public class MongoConfiguration {

    @Bean
    public MongoClient client(MongoProperties mongo) throws UnknownHostException{
        return new MongoClient(new ServerAddress(mongo.getHost(),mongo.getPort()));
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.data.mongodb")
    public MongoDbFactory mongoDbFactory(MongoProperties mongo) throws Exception{
        return new SimpleMongoDbFactory(client(mongo),mongo.getDatabase());
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) throws UnknownHostException{
        return new MongoTemplate(mongoDbFactory);
    }

}
