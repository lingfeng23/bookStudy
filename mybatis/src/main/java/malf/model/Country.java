package malf.model;

import lombok.Data;

/**
 * @author malf
 * @description 国家类
 * @project bookStudy
 * @since 2020/9/9
 */
@Data
public class Country {
	/* 国家ID */
	private Long id;
	/* 国家名称 */
	private String countryname;
	/* 国家代码 */
	private String countrycode;

}
