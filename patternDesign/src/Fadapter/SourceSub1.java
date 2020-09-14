package Fadapter;

/**
 * @author malf
 * @Description 实现抽象适配器中方法
 * @project patternDesign
 * @since 2020/8/23
 */
public class SourceSub1 extends AbstractAdapter {
	@Override
	public void editTextFile() {
		System.out.println("抽象编辑文本文件");
	}
}
