package malf.model;

/**
 * @author malf
 * @createTime 2020/9/10
 * @description 权限类
 */
public class Permission {
	/* 权限ID */
	private Long id;
	/* 权限名 */
	private String name;
	/* 权限URL */
	private String url;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
