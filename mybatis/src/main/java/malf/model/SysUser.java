package malf.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 用户类
 */
@Data
public class SysUser {
	/* 用户ID */
	private Long id;
	/* 姓名 */
	private String name;
	/* 密码 */
	private String password;
	/* 邮箱 */
	private String email;
	/* 简介 */
	private String info;
	/* 头像 */
	private byte[] image;
	/* 创建时间 */
	private Date createTime;
	/* 用户角色 */
	SysRole role;
	/* 角色表 */
	List<SysRole> roles;

}
