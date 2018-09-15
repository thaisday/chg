package com.kiddo.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/info")
    public String get() {
        return "Get!";
    }

    @PostMapping("/info")
    public String post() {
        return "Post!";
    }

    @PutMapping("/info")
    public String put() {
        return "Put!";
    }

    @DeleteMapping("info")
    public String delete() {
        return "Delete!";
    }

}
