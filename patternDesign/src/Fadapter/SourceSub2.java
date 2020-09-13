package Fadapter;

/**
 * @author malf
 * @Description 实现抽象适配器中方法
 * @project patternDesign
 * @since 2020/8/23
 */
public class SourceSub2 extends AbstractAdapter {
	@Override
	public void editWordFile() {
		System.out.println("抽象编辑Word文件");
	}
}
