package lk.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 6:58 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDTO {
    private String id;
    private String name;
    private String address;
    private int contactNo;
}
