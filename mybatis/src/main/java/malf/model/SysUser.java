package malf.model;

import java.util.Date;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 用户类
 */
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
