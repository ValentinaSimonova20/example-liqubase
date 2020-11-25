package com.example.exampleliqubase.service;

import com.example.exampleliqubase.api.TariffService;
import com.example.exampleliqubase.dao.TariffMapper;
import com.example.exampleliqubase.dto.SubscriberDTO;
import com.example.exampleliqubase.dto.TariffDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffServiceImpl implements TariffService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TariffMapper tariffMapper;

    @Override
    public TariffDTO getTariffById(Integer id) {
        return modelMapper.map(tariffMapper.getTariffById(id), TariffDTO.class);
    }
}
