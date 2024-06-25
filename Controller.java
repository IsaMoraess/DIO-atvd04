// BookController.java
package com.exemplo.biblioteca.controller;

import com.exemplo.biblioteca.model.Book;
import com.exemplo.biblioteca.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}

// AuthorController.java
package com.exemplo.biblioteca.controller;

import com.exemplo.biblioteca.model.Author;
import com.exemplo.biblioteca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @PostMapping
    public Author save(@RequestBody Author author) {
        return authorService.save(author);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorService.delete(id);
    }
}

// LoanController.java
package com.exemplo.biblioteca.controller;

import com.exemplo.biblioteca.model.Loan;
import com.exemplo.biblioteca.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @PostMapping
    public Loan save(@RequestBody Loan loan) {
        return loanService.save(loan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        loanService.delete(id);
    }
}
