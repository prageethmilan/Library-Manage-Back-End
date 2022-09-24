package lk.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:35 PM
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    @Id
    private String bookId;
    private String bookName;
    private String author;
    private String publisher;
}
