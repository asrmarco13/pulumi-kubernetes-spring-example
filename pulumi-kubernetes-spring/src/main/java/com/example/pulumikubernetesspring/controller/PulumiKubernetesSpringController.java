package com.example.pulumikubernetesspring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * * Author: Marco Orfei
 * The Class PulumiKubernetesSpringController
 */
@RestController
@RequestMapping("/pulumi-spring-example")
public class PulumiKubernetesSpringController {

    @GetMapping(value = "/hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
