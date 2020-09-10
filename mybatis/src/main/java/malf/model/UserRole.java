package malf.model;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 用户角色类
 */
public class UserRole {
	/* 用户ID */
	private Long userId;
	/* 角色ID */
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
