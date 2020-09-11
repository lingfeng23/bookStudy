package malf.model;

import java.util.Date;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 类描述
 */
public class SysRole {
	/* 角色ID */
	private Long id;
	/* 角色名 */
	private String name;
	/* 有效标志 */
	private Integer enabled;
	/* 创建人 */
	private Integer createBy;
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

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
