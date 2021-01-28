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
        //查询基本信息
        User user = loginMapper.getMapByAccountName(Integer.valueOf(accountName));
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
    }


    public User getMapByAccountName1(String accountName) {
        Permissions permissions = new Permissions();
        permissions.setId(1);permissions.setPermission("add");
        Permissions permissions2 = new Permissions();
        permissions2.setId(2);permissions2.setPermission("query");
        List<Permissions> permissionsSet = new ArrayList<>();
        permissionsSet.add(permissions);
        permissionsSet.add(permissions2);
        Role role = new Role();
        role.setRoleId(1);
        role.setRoleName("admin");
        role.setPermissions(permissionsSet);
        List<Role> roleSet = new ArrayList<>();
        roleSet.add(role);
        User user = new User();
        user.setUserId("1");user.setAccountName("151");user.setPassword("123456");
        user.setRoles(roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getAccountName()+"", user);
        List<Permissions> permissionsSet1 = new ArrayList<>();
        permissionsSet1.add(permissions2);
        Role role1 = new Role();
        role1.setRoleId(2);
        role1.setRoleName("user");
        role1.setPermissions(permissionsSet1);
        List<Role> roleSet1 = new ArrayList<>();
        roleSet1.add(role1);
        User user1 = new User();
        user1.setUserId("2");user1.setAccountName("133");user1.setPassword("123456");
        user1.setRoles(roleSet1);
        map.put(user1.getAccountName()+"", user1);
        return map.get(accountName);
    }
}
