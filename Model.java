// Book.java
package com.exemplo.biblioteca.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;

    // Getters e setters
}

// Author.java
package com.exemplo.biblioteca.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    // Getters e setters
}

// Loan.java
package com.exemplo.biblioteca.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Book book;

    private LocalDate loanDate;
    private LocalDate returnDate;

    // Getters e setters
}
