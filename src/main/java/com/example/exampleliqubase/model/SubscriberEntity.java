package com.example.exampleliqubase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubscriberEntity {
    private Long id;
    private String name;
    private TariffEntity tariff;
    private List<PaymentEntity> payments;
}
