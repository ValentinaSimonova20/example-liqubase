package com.example.exampleliqubase.controller;

import com.example.exampleliqubase.api.SubscriberService;
import com.example.exampleliqubase.dto.AccountDTO;
import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.dto.TariffDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/listSubscr")
    public List<SubscriberDTO> getListSubscribers() {

        return subscriberService.getSubscriber();
    }

    @PostMapping("/listSubscr1")
    public SubscriberDTO getSubscriber() {

        return subscriberService.getSubscriberById(1);
    }

}
