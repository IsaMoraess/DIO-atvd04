// BookService.java
package com.exemplo.biblioteca.service;

import com.exemplo.biblioteca.model.Book;
import com.exemplo.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}

// AuthorService.java
package com.exemplo.biblioteca.service;

import com.exemplo.biblioteca.model.Author;
import com.exemplo.biblioteca.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}

// LoanService.java
package com.exemplo.biblioteca.service;

import com.exemplo.biblioteca.model.Loan;
import com.exemplo.biblioteca.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> findAll() {
        return loanRepository.findAll();
    }

    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    public void delete(Long id) {
        loanRepository.deleteById(id);
    }
}

