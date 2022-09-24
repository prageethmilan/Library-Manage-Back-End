package lk.spring.service.impl;

import lk.spring.dto.BookOrderDTO;
import lk.spring.entity.BookOrder;
import lk.spring.repo.BookOrderDetailsRepo;
import lk.spring.repo.BookOrderRepo;
import lk.spring.repo.BookRepo;
import lk.spring.service.OrderBookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 10:42 PM
 **/
@Service
@Transactional
public class OrderBookServiceImpl implements OrderBookService {

    @Autowired
    BookOrderRepo bookOrderRepo;

    @Autowired
    BookOrderDetailsRepo bookOrderDetailsRepo;

    @Autowired
    BookRepo bookRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void orderBook(BookOrderDTO dto) {
        BookOrder bookOrder = mapper.map(dto, BookOrder.class);
        if (!bookOrderRepo.existsById(dto.getOrderId())) {
            if (dto.getBookOrderDetailsDTOList().size() < 1) {
                throw new RuntimeException("No books added for the order");
            } else {
                bookOrderRepo.save(bookOrder);
            }
        } else {
            throw new RuntimeException("Book Order already exists...");
        }
    }

    @Override
    public void updateBookOrder(BookOrderDTO dto) {

    }

    @Override
    public void deleteBookOrder(String oid) {
        if (bookOrderRepo.existsById(oid)) {
            bookOrderRepo.deleteById(oid);
        } else {
            throw new RuntimeException("No such order to delete...");
        }
    }

    @Override
    public BookOrderDTO searchBookOrder(String oid) {
        return mapper.map(bookOrderRepo.findById(oid).get(), BookOrderDTO.class);
    }

    @Override
    public List<BookOrderDTO> getAllBookOrders() {
        return mapper.map(bookOrderRepo.findAll(), new TypeToken<List<BookOrderDTO>>() {
        }.getType());
    }
}
