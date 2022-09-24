package lk.spring.repo;

import lk.spring.entity.BookOrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:47 PM
 **/
public interface BookOrderDetailsRepo extends JpaRepository<BookOrderDetails,String> {
}
