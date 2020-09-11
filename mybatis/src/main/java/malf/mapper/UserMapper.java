package malf.mapper;

import malf.model.SysRole;
import malf.model.SysUser;
import org.apache.ibatis.annotations.Param;

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

	/**
	 * 根据主键更新
	 * @param user
	 * @return
	 */
	int updateById(SysUser user);

	/**
	 * 根据主键删除
	 * @param id 用户ID
	 * @return
	 */
	int deleteById(Long id);

	/**
	 * 根据用户ID 和角色标志获取用户角色
	 * @param userId 用户ID
	 * @param enabled 角色标志
	 * @return
	 */
	List<SysRole> selectRolesByUserIdAndRoleEnabled(
			@Param("userId") Long userId,
			@Param("enabled") Integer enabled);

	/**
	 * 动态条件查询用户信息
	 * @param user
	 * @return
	 */
	List<SysUser> selectByUser(SysUser user);

	/**
	 * 根据主键更新
	 * @param user
	 * @return
	 */
	int updateByIdSelective(SysUser user);

	/**
	 * 根据主键或姓名查询
	 * @param user
	 * @return
	 */
	SysUser selectByIdOrName(SysUser user);

	/**
	 * 通过ID集合查询
	 * @param ids
	 * @return
	 */
	List<SysUser> selectByIdList(List<Long> ids);

	/**
	 * 批量插入
	 * @param users
	 * @return
	 */
	int insertList(List<SysUser> users);
}
