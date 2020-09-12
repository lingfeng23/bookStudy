package malf.model;

import lombok.Data;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 角色权限类
 */
@Data
public class RolePermission {
	/* 角色ID */
	private Long roleId;
	/* 权限ID */
	private Long permissionId;

}
