package com.example.exampleliqubase.dao;

import com.example.exampleliqubase.model.TariffEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TariffMapper {

    //@Select("select * from tariff where id=#{id}")
    TariffEntity getTariffById(Integer id);
}
