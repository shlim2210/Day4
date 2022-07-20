package com.koreait.day4.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemStatus {
    REGISTERED(0, "등록", "상품 등록상태"),
    UNREGISTERED(1, "중지", "상품 판매 중지상태"),
    WAITING(2, "대기", "상품 검수상태");

    private Integer id;
    private String title;
    private String description;
}
