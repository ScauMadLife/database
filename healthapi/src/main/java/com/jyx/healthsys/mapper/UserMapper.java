package com.jyx.healthsys.mapper;

import com.jyx.healthsys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 2024-04-08
 * @since 2024-04-08
 */
public interface UserMapper extends BaseMapper<User> {
    //这个方法是用来根据用户ID查询其拥有的角色名称列表的
    public List<String> getRoleNameByUserId(Integer userId);

}
