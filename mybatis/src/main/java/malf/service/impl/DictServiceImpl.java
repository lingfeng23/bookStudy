package malf.service.impl;

import malf.mapper.DictMapper;
import malf.model.Dict;
import malf.service.DictService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/10/25
 */
@Service
public class DictServiceImpl implements DictService {
	@Autowired
	DictMapper dictMapper;

	@Override
	public Dict findById(Long id) {
		return dictMapper.selectByKey(id);
	}

	@Override
	public List<Dict> findByDict(Dict dict, Integer offset, Integer limit) {
		RowBounds rowBounds = RowBounds.DEFAULT;
		if (offset != null && limit != null) {
			rowBounds = new RowBounds(offset, limit);
		}
		return dictMapper.selectByDict(dict, rowBounds);
	}

	@Override
	public boolean saveOrUpdate(Dict dict) {
		if (dict.getId() != null) {
			return dictMapper.insert(dict) == 1;
		} else {
			return dictMapper.updateById(dict) == 1;
		}
	}

	@Override
	public boolean deleteById(Long id) {
		return dictMapper.deleteById(id) == 1;
	}
}
