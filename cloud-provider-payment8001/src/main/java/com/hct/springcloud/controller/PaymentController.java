package com.hct.springcloud.controller;


import com.hct.springcloud.pojos.CommonResult;
import com.hct.springcloud.pojos.Payment;
import com.hct.springcloud.pojos.R;
import com.hct.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/29 20:57
 * @VVVersion 1.0
 **/
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    //只传给前端CommonResult，不需要前端了解其他的组件
    @PostMapping(value = "/payment/create")
    public R create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if(result > 0){
            return R.ok();
        }else{
            return R.error();
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public R getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if(payment != null)
        {
            //return new CommonResult(200,"查询成功,serverPort:  ",payment);
            return R.ok().data("payment",payment);
        }else{
           // return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
            return R.error();
        }

    }
}
