package com.fiap.foodonation.dto;

import com.fiap.foodonation.enums.OrderStatus;
import com.fiap.foodonation.models.Customer;
import com.fiap.foodonation.models.Institution;

public class OrderDto {

    private Long id;
    private Institution receiver;
    private Customer donor;
    private double value;
    private OrderStatus status;
}
