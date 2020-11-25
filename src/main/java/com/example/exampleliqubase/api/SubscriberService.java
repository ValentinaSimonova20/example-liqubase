package com.example.exampleliqubase.api;

import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.dto.TariffDTO;
import com.example.exampleliqubase.model.SubscriberEntity;
import com.example.exampleliqubase.model.TariffEntity;

import java.util.List;

public interface SubscriberService {

    List<SubscriberDTO> getSubscriber();

    SubscriberDTO getSubscriberById(Integer id);


}
