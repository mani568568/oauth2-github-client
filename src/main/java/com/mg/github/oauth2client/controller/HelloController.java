package com.mg.github.oauth2client.controller;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@EnableOAuth2Sso
public class HelloController {

    @GetMapping("/")
    public String message(Principal principal) {
        return "Hi "+principal.getName();
    }

}
