package malf.mapper;

import malf.model.SysPermission;
import malf.provider.PermissionProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @author malf
 * @description PermissionMapper
 * @project bookStudy
 * @since 2020/9/9
 */
public interface PermissionMapper {
	@SelectProvider(type = PermissionProvider.class, method = "selectById")
	SysPermission selectById(Long id);
	List<SysPermission> selectAll();
}
