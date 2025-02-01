package com.vinna.bookstore.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vinna.bookstore.model.*;

public interface Bookrepo extends JpaRepository<Book,Long> {

}
