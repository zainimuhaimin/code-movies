package idn.code.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MoviesController {
    
    @GetMapping
    public String hello(){
        return "hello World";
    }
}
