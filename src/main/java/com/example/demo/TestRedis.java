package com.example.demo;

import org.springframework.boot.autoconfigure.cache.CacheProperties.Redis;

public class TestRedis {

	public static void main(String[] args) {
		Redis r = new Redis();
		
		System.out.println(r.getKeyPrefix());
	}
}
