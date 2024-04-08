package com.jyx.healthsys.service;

import com.jyx.healthsys.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 2024-04-08
 * @since 2024-04-08
 */
public interface IRoleService extends IService<Role> {

    boolean addRole(Role role);

    Role getRoleById(Integer id);

    void updateRole(Role role);

    void deleteRoleById(Integer id);
}
