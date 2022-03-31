package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    private static final String PATH = "/error";
@RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
public String error(){
    return "This URL does not work. Please try another URL";
}
public String getErrorPath(){
    return PATH;
}
}
