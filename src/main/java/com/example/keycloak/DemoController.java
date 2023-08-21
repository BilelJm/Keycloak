package com.example.keycloak;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/keycloak")
public class DemoController {


    @GetMapping("keycloakUser")
    @PreAuthorize("hasAuthority('USER')")
    public String keycloakUser() {
        return "Keycloak - USER";
    }

    @GetMapping("/keycloakAdmin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String keycloakAdmin() {
        return "keycloak - ADMIN";
    }

}