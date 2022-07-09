package br.com.microservice.bookservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
