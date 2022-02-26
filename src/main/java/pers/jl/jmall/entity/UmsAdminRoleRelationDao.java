package pers.jl.jmall.entity;

import pers.jl.jmall.mbg.entity.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: UmsAdminRoleRelationDao.java
 * @Description: 后台用户与角色管理自定义Dao
 * @author: JL Du
 * @date: 2022/2/26 23:25
 * @version: 1.0.0
 */

public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

}