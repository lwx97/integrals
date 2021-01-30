package com.maowudi.integrals.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Redis工具类
 */

@Component
public final class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> template;

    public Object getKey(String key){
        return template.opsForValue().get(key);
    }

    public void setObjValue(String key,Object value){
        template.opsForValue().set(key,value,1000*3600*12);
    }

    public String objToMapToKVString(Object obj){
        String key = "";
        if(Objects.isNull(obj)){
            return key;
        }
        key = JSON.toJSONString(obj).replaceAll(":","");
        return key;
    }
}
