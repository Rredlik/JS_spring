package com.dostovalov.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresBooksController {

    @GetMapping("/genres/index")
    public String getGenres() {
        return "genres/index";
    }
}