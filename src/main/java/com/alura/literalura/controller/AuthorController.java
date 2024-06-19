package com.alura.literalura.controller;

import com.alura.literalura.model.Author;
import com.alura.literalura.service.AuthorService;
import org.springframework.web.bind.annotation.*;
import com.alura.literalura.model.Author;
import com.alura.literalura.service.AuthorService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")

public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.findAllAuthors();
    }

    @PostMapping
    public void addAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }
}
