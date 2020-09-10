package malf.mapper;

import malf.model.SysRole;
import malf.model.SysUser;

import java.util.List;

/**
 * @author malf
 * @description UserMapper 类
 * @project bookStudy
 * @since 2020/9/9
 */
public interface UserMapper {
	/**
	 * 通过 ID 查询用户
	 * @param id 用户ID
	 * @return
	 */
	SysUser selectById(Long id);

	/**
	 * 查询全部用户
	 * @return
	 */
	List<SysUser> selectAll();

	/**
	 * 根据用户ID 获取角色信息
	 * @param userId 用户ID
	 * @return
	 */
	List<SysRole> selectRolesByUserId(Long userId);

	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	int insert(SysUser user);

	/**
	 * 新增用户-使用自增主键
	 * @param user
	 * @return
	 */
	int insertNew(SysUser user);

	/**
	 * 新增用户-使用 selectKey
	 * @param user
	 * @return
	 */
	int insertNew2(SysUser user);

}
