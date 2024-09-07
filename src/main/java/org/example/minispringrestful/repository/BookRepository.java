package org.example.minispringrestful.repository;

import org.example.minispringrestful.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
