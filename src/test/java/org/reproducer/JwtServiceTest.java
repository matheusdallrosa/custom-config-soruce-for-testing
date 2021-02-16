package org.reproducer;

import org.junit.jupiter.api.Test;

public class JwtServiceTest {

    @Test
    public void createJwt(){
        JwtService jwtService = new JwtService();
        String jwt = jwtService.create();
    }
}
