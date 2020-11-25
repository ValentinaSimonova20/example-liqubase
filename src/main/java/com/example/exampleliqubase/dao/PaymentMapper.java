package com.example.exampleliqubase.dao;

import com.example.exampleliqubase.model.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PaymentMapper {

    List<PaymentEntity> getPaymentsByIdSub(Integer id);
}
