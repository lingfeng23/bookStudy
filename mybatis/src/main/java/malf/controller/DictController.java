package malf.controller;

import malf.model.Dict;
import malf.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/10/25
 */
@Controller
@RequestMapping("/dict")
public class DictController {
	@Autowired
	private DictService dictService;

	/**
	 * 显示字典数据列表
	 */
	public ModelAndView dicts(Dict dict, Integer offset, Integer limit) {
		ModelAndView modelAndView = new ModelAndView("dict");
		List<Dict> dicts = dictService.findByDict(dict, offset, limit);
		modelAndView.addObject(dicts);
		return modelAndView;
	}

	/**
	 * 新增或修改
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(Long id) {
		ModelAndView modelAndView = new ModelAndView("dict_add");
		Dict dict;
		if (id == null) {
			dict = new Dict();
		} else {
			dict = dictService.findById(id);
		}
		modelAndView.addObject("model", dict);
		return modelAndView;
	}

	/**
	 * 珊瑚字典信息
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap delete(@RequestParam Long id) {
		ModelMap modelMap = new ModelMap();
		try {
			boolean success = dictService.deleteById(id);
			modelMap.put("success", success);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("msg", e.getMessage());
		}
		return modelMap;
	}
}
