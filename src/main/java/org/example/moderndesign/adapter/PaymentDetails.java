package org.example.moderndesign.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentDetails {
    private String accountId;
    private double amount;
}
