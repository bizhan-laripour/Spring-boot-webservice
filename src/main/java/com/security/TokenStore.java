package com.security;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TokenStore {


    public static String createToken(){
        SignatureAlgorithm algorithm = SignatureAlgorithm.ES256;
        JwtBuilder jwtBuilder = Jwts.builder()
//                .setId("something")
//                .setAudience("something")
//                .setSubject("something")

                .setExpiration(new Date(System.currentTimeMillis()+SecurityConstants.EXPIRATION_TIME))
                .signWith(algorithm , SecurityConstants.SECRET);
        return SecurityConstants.TOKEN_PREFIX + jwtBuilder.compact();
    }
}
