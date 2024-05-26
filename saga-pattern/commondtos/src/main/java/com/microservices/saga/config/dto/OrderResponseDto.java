package com.microservices.saga.config.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderResponseDto {

    private Integer userId;
    private Integer productId;

    private Integer amount;

    private Integer orderId;

}
