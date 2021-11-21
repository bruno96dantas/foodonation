package com.fiap.foodonation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressDto {

    private Long id;
    private String street;
    private int number;
    private String district;
    private int zipCode;
    private String city;
    private String state;
}
