package com.hct.springcloud.service;

import com.hct.springcloud.pojos.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/29 20:54
 * @VVVersion 1.0
 **/
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
