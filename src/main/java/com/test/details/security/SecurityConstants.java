package com.test.details.security;

public class SecurityConstants {
    public static final String SECRET = "MyKey";
    public static final long EXPIRATION_TIME = 432_000_000; // 5 days (in milliseconds)
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}