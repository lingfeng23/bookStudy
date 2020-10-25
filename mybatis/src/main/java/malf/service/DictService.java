package malf.service;

import malf.model.Dict;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/10/25
 */
@Service
@Component
public interface DictService {
	Dict findById(Long id);
	List<Dict> findByDict(Dict dict, Integer offset, Integer limit);
	boolean saveOrUpdate(Dict dict);
	boolean deleteById(Long id);
}
