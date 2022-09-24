package lk.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:32 PM
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Member {
    @Id
    private String id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String address;
    private int contactNo;
}
