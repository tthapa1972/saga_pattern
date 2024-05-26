package com.microservices.saga.order.service;

import com.microservices.saga.config.dto.OrderRequestDto;
import com.microservices.saga.config.event.OrderEvent;
import com.microservices.saga.config.event.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.Date;
import java.util.UUID;

@Service
public class OrderStatusPublisher {

    @Autowired
    private Sinks.Many<OrderEvent> orderSinks;


    public void publishOrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus){
        OrderEvent orderEvent=new OrderEvent(UUID.randomUUID(), new Date(), orderRequestDto,orderStatus);
        orderSinks.tryEmitNext(orderEvent);
    }
}