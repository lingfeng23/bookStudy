package malf.model;

import lombok.Data;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 权限类
 */
@Data
public class SysPermission {
	/* 权限ID */
	private Long id;
	/* 权限名 */
	private String name;
	/* 权限URL */
	private String url;

}
