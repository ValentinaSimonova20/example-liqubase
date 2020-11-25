package com.example.exampleliqubase.service;

import com.example.exampleliqubase.api.PaymentService;
import com.example.exampleliqubase.dao.PaymentMapper;
import com.example.exampleliqubase.dto.PaymentDTO;
import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.model.PaymentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public List<PaymentDTO> getPaymentsByIdSub(Integer id) {
        return paymentMapper.getPaymentsByIdSub(id).stream()
                .map(paymentEntity-> modelMapper.map(paymentEntity, PaymentDTO.class))
                .collect(Collectors.toList());
    }
}
