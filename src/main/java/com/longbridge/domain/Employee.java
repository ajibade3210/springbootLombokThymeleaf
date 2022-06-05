package com.longbridge.domain;


import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @NotNull(message = "Id cannot be blank")
    private Long id;
    @NotBlank
    @Size(min = 2,max = 18,message = "First Name Must  Be Between 2 & 18")
    private String firstName;
    @Size(min = 2,max = 18,message = "First Name Must  Be Between 2 & 18")
    private String lastName;
    @Valid
    private Address address;


}
