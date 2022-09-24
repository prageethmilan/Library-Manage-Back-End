package lk.spring.service.impl;

import lk.spring.dto.BookDTO;
import lk.spring.entity.Book;
import lk.spring.repo.BookRepo;
import lk.spring.service.BookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 8:13 PM
 **/
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addBook(BookDTO dto) {
        if (!repo.existsById(dto.getBookId())) {
            repo.save(mapper.map(dto, Book.class));
        } else {
            throw new RuntimeException("Book already exists...");
        }
    }

    @Override
    public void updateBook(BookDTO dto) {
        if (repo.existsById(dto.getBookId())) {
            repo.save(mapper.map(dto, Book.class));
        } else {
            throw new RuntimeException("No such book to update...");
        }
    }

    @Override
    public void deleteBook(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No such book to delete...");
        }
    }

    @Override
    public BookDTO searchBook(String id) {
        return mapper.map(repo.findById(id).get(), BookDTO.class);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return mapper.map(repo.findAll(), new TypeToken<List<BookDTO>>() {
        }.getType());
    }
}
