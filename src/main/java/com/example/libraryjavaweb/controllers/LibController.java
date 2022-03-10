package com.example.libraryjavaweb.controllers;

import com.example.libraryjavaweb.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LibController {

    private final BookDAO bookDAO;

    @Autowired
    public LibController(BookDAO bookDAO){this.bookDAO=bookDAO;}

    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("books",bookDAO.show());
        return "main_page";
    }

    @GetMapping("/mainjson")
    public ResponseEntity getMainJson(){
        return ResponseEntity.ok(bookDAO.show());
    }
}
