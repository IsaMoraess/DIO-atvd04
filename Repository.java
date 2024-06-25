// BookRepository.java
package com.exemplo.biblioteca.repository;

import com.exemplo.biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

// AuthorRepository.java
package com.exemplo.biblioteca.repository;

import com.exemplo.biblioteca.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

// LoanRepository.java
package com.exemplo.biblioteca.repository;

import com.exemplo.biblioteca.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
