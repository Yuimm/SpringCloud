package com.hct.springcloud.service.impl;

import com.hct.springcloud.dao.PaymentDao;
import com.hct.springcloud.pojos.Payment;
import com.hct.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/29 20:55
 * @VVVersion 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
