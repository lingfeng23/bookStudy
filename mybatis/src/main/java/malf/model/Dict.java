package malf.model;

import lombok.Data;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/10/25
 */
@Data
public class Dict {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String name;
	private String value;
}
