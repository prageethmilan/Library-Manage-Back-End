package lk.spring.controller;

import lk.spring.dto.BookDTO;
import lk.spring.service.BookService;
import lk.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:24 PM
 **/
@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllBooks() {
        return new ResponseUtil(200, "Ok", service.getAllBooks());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addBook(@ModelAttribute BookDTO dto) {
        service.addBook(dto);
        return new ResponseUtil(200, "Saved", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateBook(@RequestBody BookDTO dto) {
        service.updateBook(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteBook(@RequestParam String id) {
        service.deleteBook(id);
        return new ResponseUtil(200, "deleted", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchBook(@PathVariable String id) {
        return new ResponseUtil(200, "Ok", service.searchBook(id));
    }
}
