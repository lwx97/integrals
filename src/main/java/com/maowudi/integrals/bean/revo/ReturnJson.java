package com.maowudi.integrals.bean.revo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class ReturnJson implements Serializable {
    public static String ok = success();
    public static String er = error("");

    private Integer success = 1;//1：成功， 0：失败

    private String error = "";

    private Object Data;

    public static String success(){
        ReturnJson returnJson = new ReturnJson();
        return JSONObject.toJSONString(returnJson);
    }

    public static String success(Object data){
        ReturnJson returnJson = new ReturnJson();
        returnJson.setData(data);
        return JSONObject.toJSONString(returnJson);
    }

    public static String error(String error){
        ReturnJson returnJson = new ReturnJson();
        returnJson.setSuccess(0);
        returnJson.setError(error);
        return JSONObject.toJSONString(returnJson);
    }
}
