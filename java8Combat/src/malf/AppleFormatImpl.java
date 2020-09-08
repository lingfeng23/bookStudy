package malf;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public class AppleFormatImpl implements AppleFormat {
	@Override
	public String accept(Apple a) {
		String string =  a.getWeight() > 150 ? "heavy": "light";
		return string + "--" + a.getColor();
	}
}
