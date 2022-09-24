package lk.spring.repo;

import lk.spring.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:34 PM
 **/

public interface BookRepo extends JpaRepository<Book, String> {

}
