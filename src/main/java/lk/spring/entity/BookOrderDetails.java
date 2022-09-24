package lk.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@IdClass(OrderBook_PK.class)
public class BookOrderDetails {
    @Id
    private String orderId;
    @Id
    private String bookId;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "orderId",referencedColumnName = "orderId",insertable = false,updatable = false)
    private BookOrder bookOrder;

    @ManyToOne
    @JoinColumn(name = "bookId",referencedColumnName = "bookId",insertable = false,updatable = false)
    private Book books;
}