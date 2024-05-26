package com.microservices.saga.config.event;

import com.microservices.saga.config.dto.PaymentRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentEvent implements Event{

    private UUID eventId = UUID.randomUUID();

    private Date date = new Date();

    private PaymentRequestDto paymentRequestDto;

    private PaymentStatus paymentStatus;


    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return date;
    }
}
