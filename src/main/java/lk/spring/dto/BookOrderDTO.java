package lk.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:02 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookOrderDTO {
    private String orderId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private MemberDTO memberDTO;
    private List<BookOrderDetailsDTO> bookOrderDetailsDTOList;
}
