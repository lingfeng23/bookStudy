package malf.mapper;

import malf.model.Dict;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/10/25
 */
@Component
public interface DictMapper {
	/**
	 * 根据主键查询
	 */
	Dict selectByKey(Long id);

	/**
	 * 条件查询
	 */
	List<Dict> selectByDict(Dict dict, RowBounds rowBounds);


	/**
	 * 新增
	 */
	int insert(Dict dict);

	/**
	 * 根据主键更新
	 */
	int updateById(Dict dict);

	/**
	 * 根据主键删除
	 */
	int deleteById(Long id);
}
