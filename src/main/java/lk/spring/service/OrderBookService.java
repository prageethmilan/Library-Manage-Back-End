package lk.spring.service;

import lk.spring.dto.BookDTO;
import lk.spring.dto.BookOrderDTO;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:42 PM
 **/
public interface OrderBookService {
    void orderBook(BookOrderDTO dto);
    void updateBookOrder(BookOrderDTO dto);
    void deleteBookOrder(String oid);
    BookOrderDTO searchBookOrder(String oid);
    List<BookOrderDTO> getAllBookOrders();
}
