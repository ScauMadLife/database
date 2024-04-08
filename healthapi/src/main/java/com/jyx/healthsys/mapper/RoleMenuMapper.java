package com.jyx.healthsys.mapper;

import com.jyx.healthsys.entity.RoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 2024-04-08
 * @since 2024-04-08
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    //这个方法是为了根据角色ID获取该角色拥有的菜单ID列表。
    public List<Integer> getMenuIdListByRoleId(Integer roleId);
}
