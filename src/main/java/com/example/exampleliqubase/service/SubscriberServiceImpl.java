package com.example.exampleliqubase.service;

import com.example.exampleliqubase.api.SubscriberService;
import com.example.exampleliqubase.dao.SubscriberMapper;
import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.dto.TariffDTO;
import com.example.exampleliqubase.model.SubscriberEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SubscriberMapper subscriberMapper;


    @Override
    public List<SubscriberDTO> getSubscriber() {
        return subscriberMapper.getSubscriber().stream()
                .map(subscriberEntity -> modelMapper.map(subscriberEntity, SubscriberDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public SubscriberDTO getSubscriberById(Integer id) {
        return modelMapper.map(subscriberMapper.getSubscriberById(id), SubscriberDTO.class);
    }


}
