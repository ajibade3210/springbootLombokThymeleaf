package com.longbridge.domain;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotBlank
    @Size(min = 5,max = 20,message = "Street Name Must  Be Between 5 & 20")
    private String street;
    @Size(min = 2,max = 18,message = "State Must Be Between 2 & 18")
    private String state;
    private String zipcode;
}
