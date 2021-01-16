package com.isaacaleixo.bookstoremanager.repository;

import com.isaacaleixo.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {


}
