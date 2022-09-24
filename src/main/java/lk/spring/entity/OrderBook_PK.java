package lk.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:47 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderBook_PK implements Serializable {
    private String orderId;
    private String bookId;
}
