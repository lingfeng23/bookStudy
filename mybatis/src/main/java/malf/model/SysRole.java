package malf.model;

import lombok.Data;

import java.util.Date;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 类描述
 */
@Data
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

}
