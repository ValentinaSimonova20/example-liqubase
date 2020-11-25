package com.example.exampleliqubase.api;

import com.example.exampleliqubase.dto.PaymentDTO;
import com.example.exampleliqubase.model.PaymentEntity;

import java.util.List;

public interface PaymentService {

    List<PaymentDTO> getPaymentsByIdSub(Integer id);
}
