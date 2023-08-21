package com.example.keycloak.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "keycloak", url = "http://localhost:8084/api/v1/demo")
public interface MicroserviceClient {

    @GetMapping("/microserviceAdmin")
    String microserviceAdmin();

    @GetMapping("/microserviceUser")
    String microserviceUser();
}
