package com.mycompany.app.hotel_management.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Staff {
    private int Id;
    private String name;
    private String address;
    private String phone;
}
