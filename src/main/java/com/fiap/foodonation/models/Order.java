package com.fiap.foodonation.models;

import com.fiap.foodonation.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Institution receiver;
    @OneToOne
    private Customer donor;
    private double value;
    private OrderStatus status;
}
