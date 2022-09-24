package lk.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:27 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookOrderDetailsDTO {
    private String orderId;
    private String bookId;
    private String bookName;
}
