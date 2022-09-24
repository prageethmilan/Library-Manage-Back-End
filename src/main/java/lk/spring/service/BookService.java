package lk.spring.service;

import lk.spring.dto.BookDTO;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 8:09 PM
 **/
public interface BookService {
    void addBook(BookDTO dto);
    void updateBook(BookDTO dto);
    void deleteBook(String id);
    BookDTO searchBook(String id);
    List<BookDTO> getAllBooks();
}
