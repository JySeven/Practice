package com.example.practice.redis;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisPool;

public class jedisTest {
    @Autowired
    private JedisPool jedisPool;

    public void test(){
        jedisPool.getResource();
    }
}
