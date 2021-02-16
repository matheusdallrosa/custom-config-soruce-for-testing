package org.reproducer;

import io.smallrye.jwt.build.Jwt;

import java.util.Set;

public class JwtService {

    public String create(){
        return Jwt.upn("test@test.com")
            .groups(Set.of("ADMIN", "MANAGER"))
            .sign();
    }
}
