package lk.spring.controller;

import lk.spring.dto.BookOrderDTO;
import lk.spring.service.OrderBookService;
import lk.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:40 PM
 **/
@RestController
@CrossOrigin
@RequestMapping("api/v1/orderbook")
public class OrderBookController {

    @Autowired
    OrderBookService service;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllBookOrders() {
        return new ResponseUtil(200, "Ok", service.getAllBookOrders());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil orderBook(@ModelAttribute BookOrderDTO dto) {
        service.orderBook(dto);
        return new ResponseUtil(200, "Order Placed", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteBookOrder(@RequestParam String id) {
        service.deleteBookOrder(id);
        return new ResponseUtil(200, "Deleted", null);
    }

    @GetMapping(path = "/{oid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchBookOrder(@PathVariable String oid) {
        return new ResponseUtil(200, "Ok", service.searchBookOrder(oid));
    }
}
