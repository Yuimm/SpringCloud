package com.hct.springcloud.pojos;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 统一返回结果
 * @author: HCT
 * @create: 2021/04/25 14:01
 * @VVVersion 1.0
 **/
@Data
public class R {

    private Boolean success;


    private Integer code;


    private String message;


    private Map<String,Object> data = new HashMap<String,Object>();

    //构造方法私有化
    private R(){}

    //成功静态方法
    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败静态方法
    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }

}