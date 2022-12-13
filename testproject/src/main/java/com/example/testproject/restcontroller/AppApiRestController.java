package com.example.testproject.restcontroller;

import com.example.testproject.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class AppApiRestController {
    @Autowired
    public UrlService urlService;

    @GetMapping("/testcallapi")
    public String tastcallapi() throws Exception {
       return urlService.sendGET();
    }
}
