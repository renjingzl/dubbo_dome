package com.baojia.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    @Qualifier("jedisPool")
    private JedisPool jedisPool;

    @Test
    public void contextLoads() {
        System.out.print("jedisPool==========="+jedisPool);
    }

}
