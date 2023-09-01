package com.pial.book_club_organizer.controller;

import com.pial.book_club_organizer.model.Book;
import com.pial.book_club_organizer.repository.BookRepositoryImpl;
import com.pial.book_club_organizer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllCandidate() {
        List<Book> bookList = bookService.getAllBook();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

}
