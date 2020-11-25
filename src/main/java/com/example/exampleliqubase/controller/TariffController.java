package com.example.exampleliqubase.controller;

import com.example.exampleliqubase.api.SubscriberService;
import com.example.exampleliqubase.api.TariffService;
import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.dto.TariffDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class TariffController {


    @Autowired
    private TariffService tariffService;

    @CrossOrigin
    @PostMapping("/tarif1")
    public TariffDTO getTariff() {

        return tariffService.getTariffById(1);
    }

}
