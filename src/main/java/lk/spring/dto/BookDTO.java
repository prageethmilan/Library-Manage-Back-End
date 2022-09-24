package lk.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:00 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookDTO {
    private String bookId;
    private String bookName;
    private String author;
    private String publisher;
}
