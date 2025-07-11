
package com.example.TravelHub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class SessionService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void saveSession(String token, String userId, long ttlSeconds) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("session:" + token, userId, Duration.ofSeconds(ttlSeconds));
    }

    public String getUserIdFromToken(String token) {
        return redisTemplate.opsForValue().get("session:" + token);
    }

    public void deleteSession(String token) {
        redisTemplate.delete("session:" + token);
    }

}
