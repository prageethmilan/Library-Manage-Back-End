package lk.spring.repo;

import lk.spring.entity.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:46 PM
 **/
public interface BookOrderRepo extends JpaRepository<BookOrder,String> {
}
