package com.maowudi.integrals.login.dao;

import com.maowudi.integrals.bean.Permissions;
import com.maowudi.integrals.bean.Role;
import com.maowudi.integrals.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: integrals
 * @Package: com.maowudi.integrals.login.dao
 * @ClassName: LoginMapper
 * @Author: 李文祥
 * @Description:
 * @Date: 2021/1/28 20:48
 * @Version: 1.0
 */
@Mapper
public interface LoginMapper {

    User getMapByAccountName(@Param("accountName") Integer accountName);

    List<Role> getRoleByUserId(@Param("userId") String userId);

    List<Permissions> getPermissionByRoleId(@Param("roleId") Integer roleId);
}
