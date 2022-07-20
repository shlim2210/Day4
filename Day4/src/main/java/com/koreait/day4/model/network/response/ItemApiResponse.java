package com.koreait.day4.model.network.response;

import com.koreait.day4.model.enumclass.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemApiResponse {
    private Long id;
    private String name;
    private ItemStatus status;
    private String title;
    private String content;
    private BigDecimal price;
    private LocalDateTime regDate;
    private Long partnerId;
}
