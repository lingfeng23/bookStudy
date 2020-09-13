package Fadapter;

/**
 * @author malf
 * @Description 适配器
 * @project patternDesign
 * @since 2020/8/23
 */
public class Adapter extends Source implements Targetable {
	@Override
	public void editWordFile() {
		System.out.println("编辑Word文件");
	}
}
