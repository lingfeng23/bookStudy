package malf.mapper;

import malf.model.SysUser;

import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/9/9
 */
public interface UserMapper {
	List<SysUser> selectAll();
}
