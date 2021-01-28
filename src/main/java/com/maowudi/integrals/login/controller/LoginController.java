package com.maowudi.integrals.login.controller;

import com.maowudi.integrals.bean.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login")
    public String login(){
        return "/login";
    }

    @ResponseBody
    @RequestMapping("/userLogin")
    public String userLogin(@RequestBody User user){
        if (StringUtils.isEmpty(user.getAccountName()) || StringUtils.isEmpty(user.getPassword())) {
            return "请输入用户名和密码！";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(String.valueOf(user.getAccountName()), user.getPassword());
        try{
            subject.login(usernamePasswordToken);
        }catch (UnknownAccountException e) {
            log.error("用户名不存在！", e);
            return "用户名不存在！";
        } catch (AuthenticationException e) {
            log.error("账号或密码错误！", e);
            return "账号或密码错误！";
        } catch (AuthorizationException e) {
            log.error("没有权限！", e);
            return "没有权限";
        }
        return "success";
    }

//    @RequiresRoles("admin")
//    @RequestMapping("/admin")
//    public String admin() {
//        return "admin success!";
//    }
//
//    @RequiresPermissions("query")
//    @RequestMapping("/index")
//    public String index() {
//        return "/index";
//    }
//
//    @RequiresPermissions("add")
//    @RequestMapping("/add")
//    public String add() {
//        return "add success!";
//    }
}
