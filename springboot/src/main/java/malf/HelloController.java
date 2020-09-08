package malf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 类描述
 */
@RestController
public class HelloController {
	@RequestMapping("/test")
	public String test() {
		return "Hello";
	}

}
