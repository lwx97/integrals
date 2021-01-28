package com.maowudi.integrals.login.service;

import com.maowudi.integrals.bean.Permissions;
import com.maowudi.integrals.bean.Role;
import com.maowudi.integrals.bean.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService{
    @Override
    public User userLogin() {
        return null;
    }

    @Override
    public User getMapByAccountName(String accountName) {
        Permissions permissions = new Permissions();
        permissions.setId(1);permissions.setPermission("add");
        Permissions permissions2 = new Permissions();
        permissions2.setId(2);permissions2.setPermission("query");
        Set<Permissions> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions);
        permissionsSet.add(permissions2);
        Role role = new Role();
        role.setRoleId(1);
        role.setRoleName("admin");
        role.setPermissions(permissionsSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
        User user = new User();
        user.setUserId("1");user.setAccountName(151);user.setPassword("123456");
        user.setRoles(roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getAccountName()+"", user);
        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions2);
        Role role1 = new Role();
        role1.setRoleId(2);
        role1.setRoleName("user");
        role1.setPermissions(permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        User user1 = new User();
        user1.setUserId("2");user1.setAccountName(133);user1.setPassword("123456");
        user1.setRoles(roleSet1);
        map.put(user1.getAccountName()+"", user1);
        return map.get(accountName);
    }
}
