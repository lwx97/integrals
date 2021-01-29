package com.maowudi.integrals.login.service;

import com.maowudi.integrals.bean.Permissions;
import com.maowudi.integrals.bean.Role;
import com.maowudi.integrals.bean.User;
import com.maowudi.integrals.login.dao.LoginMapper;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

@Service
public class LoginServiceImpl implements LoginService{

    @Resource
    private LoginMapper loginMapper;

    @Override
    public User userLogin() {
        return null;
    }

    @Override
    public User getMapByAccountName(String accountName) {
        if(StringUtils.isEmpty(accountName)){
            return null;
        }
        try {
            Integer acc = Integer.valueOf(accountName);
            //查询基本信息
            User user = loginMapper.getMapByAccountName(acc);
            if(!Objects.isNull(user)){
                //查询所属角色
                List<Role> roleList = loginMapper.getRoleByUserId(user.getUserId());
                //查询角色的所有权限
                for(Role role : roleList){
                    List<Permissions> permissionsList = loginMapper.getPermissionByRoleId(role.getRoleId());
                    role.setPermissions(permissionsList);
                }
                user.setRoles(roleList);
            }
            return user;
        }catch (NumberFormatException e){
            return null;
        }
    }
}
