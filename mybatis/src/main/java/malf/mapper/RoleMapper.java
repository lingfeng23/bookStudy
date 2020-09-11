package malf.mapper;

import malf.model.SysRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author malf
 * @description RoleMapper
 * @project bookStudy
 * @since 2020/9/9
 */
public interface RoleMapper {
	@Select({"select id, name, enabled, create_by createBy, create_time createTime ",
			"from sys_role ", "where id = #{id}"})
	SysRole selectById(Long id);

	@Insert({"insert into sys_role(name, enabled, create_by, create_time)",
			"values(#{name}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(SysRole role);

	List<SysRole> selectAll();
}
