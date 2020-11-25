package com.example.exampleliqubase.dto;

import com.example.exampleliqubase.model.PaymentEntity;
import com.example.exampleliqubase.model.TariffEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriberDTO {
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private TariffEntity tariff;
    @NotNull
    private List<PaymentEntity> payments;
}
