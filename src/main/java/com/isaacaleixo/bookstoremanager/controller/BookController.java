package com.isaacaleixo.bookstoremanager.controller;

import com.isaacaleixo.bookstoremanager.dto.MessageResponseDTO;
import com.isaacaleixo.bookstoremanager.entity.Book;
import com.isaacaleixo.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){

        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId())
                .build();
    }

}
