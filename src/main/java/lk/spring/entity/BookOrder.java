package lk.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:36 PM
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookOrder {
    @Id
    private String orderId;
    private LocalDate date;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "memberId", referencedColumnName = "id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "bookOrder", cascade = CascadeType.ALL)
    private List<BookOrderDetails> bookOrderDetailsList = new java.util.ArrayList<>();
}
