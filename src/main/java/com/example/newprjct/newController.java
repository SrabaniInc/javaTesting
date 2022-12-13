package com.example.newprjct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class newController {
	
	@GetMapping("/getAll")
    public String get() {
        return "testing";
    }

}
