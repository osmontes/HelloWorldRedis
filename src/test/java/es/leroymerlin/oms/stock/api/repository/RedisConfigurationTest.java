package es.leroymerlin.oms.stock.api.repository;


import es.leroymerlin.oms.stock.configuration.RedisProperties;
import org.springframework.boot.test.context.TestConfiguration;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@TestConfiguration
class RedisConfigurationTest {
    private RedisServer redisServer;

    public RedisConfigurationTest(RedisProperties redisProperties){
        this.redisServer = new RedisServer(redisProperties.getRedisPort());
    }

    @PostConstruct
    public void postConstruct(){
        redisServer.start();
    }

    @PreDestroy
    public void preDestroy(){
        redisServer.stop();
    }

}