package com.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerContoller {
    @GetMapping("/msg")
    public String getMessage(){
        return "Hitesh kumar jenkins is working 🥰🥰🥰🥰🥰😍😍💕💕🎉🎉🎉🎉🎉🎉";
    }
}
