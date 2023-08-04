package com.example.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {


    @GetMapping("keycloakUser")
    @PreAuthorize("hasRole('user')")
    public String keycloakUser() {
        return "Keycloak - USER";
    }

    @GetMapping("/keycloakAdmin")
    @PreAuthorize("hasRole('admin')")
    public String keycloakAdmin() {
        return "keycloak - ADMIN";
    }

}