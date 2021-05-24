package com.pkce.example.pkceexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth/realms/")
@RestController
public class ClientManagerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/{realm}/clients-registrations/default", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createClientId (@RequestHeader("Authorization") String bearerToken, @RequestBody String inputPayload) {

        return "Hello";
    }
}
