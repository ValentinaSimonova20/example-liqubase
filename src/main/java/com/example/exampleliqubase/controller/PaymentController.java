package com.example.exampleliqubase.controller;

import com.example.exampleliqubase.api.PaymentService;
import com.example.exampleliqubase.dto.PaymentDTO;
import com.example.exampleliqubase.dto.SubscriberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/listPayments")
    public List<PaymentDTO> getListPayments() {

        return paymentService.getPaymentsByIdSub(1);
    }



}
