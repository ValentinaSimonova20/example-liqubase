package com.example.exampleliqubase.dao;

import com.example.exampleliqubase.model.SubscriberEntity;
import com.example.exampleliqubase.model.TariffEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubscriberMapper {

  //  @Select("select * from subscriber where id=#{id}")
    SubscriberEntity getSubscriberById(Integer id);

   @Select("select * from subscriber")
    List<SubscriberEntity> getSubscriber();



}
