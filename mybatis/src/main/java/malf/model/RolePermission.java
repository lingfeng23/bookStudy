package malf.model;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 角色权限类
 */
public class RolePermission {
	/* 角色ID */
	private Long roleId;
	/* 权限ID */
	private Long permissionId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
}
