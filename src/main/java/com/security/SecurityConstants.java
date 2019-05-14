package com.security;


public class SecurityConstants {


    public static final String SECRET = "SecretKeyToGenJWTs";

    public static final long EXPIRATION_TIME = 1*60*60*1000;

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER_STRING = "Authorization";

    public static final String SIGN_UP_URL = "/**";
}
