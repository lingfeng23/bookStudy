package malf.model;

/**
 * @author malf
 * @description 国家类
 * @project bookStudy
 * @since 2020/9/9
 */
public class Country {
	/* 国家ID */
	private Long id;
	/* 国家名称 */
	private String countryname;
	/* 国家代码 */
	private String countrycode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
}
