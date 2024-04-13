package com.mycompany.app.hotel_management.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {
    // info booked room
    int id;
    int reservationId;
    double totalPrice;
    String paymentMethod;
    Date paymentDate;
}
