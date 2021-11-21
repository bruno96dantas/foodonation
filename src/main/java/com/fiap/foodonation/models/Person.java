package com.fiap.foodonation.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToMany;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public abstract class Person {
    private String name;
    private String email;
    private int ddd;
    private int phone;

    @ManyToMany
    private Address address;
}
