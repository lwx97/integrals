package com.maowudi.integrals.user.controller;

import com.maowudi.integrals.bean.revo.Page;
import com.maowudi.integrals.bean.revo.ReturnJson;
import com.maowudi.integrals.bean.User;
import com.maowudi.integrals.bean.paramsvo.UserParamsVo;
import com.maowudi.integrals.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public String getAllUser(@RequestBody(required = false) @Validated UserParamsVo userParamsVo){
        Page page = userParamsVo.getPage();
        Integer total = userService.getAllUserTotal(userParamsVo);
        if(total > 0){
            List<User> users = userService.getAllUser(userParamsVo);
            return ReturnJson.success(page.setPageList(total,users));
        }
        return null;
    }

}
