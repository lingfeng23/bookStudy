package Fadapter;

/**
 * @author malf
 * @Description 对象适配器
 * @project patternDesign
 * @since 2020/8/23
 */
public class ObjectAdapter implements Targetable {
	private Source source;
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}
	@Override
	public void editTextFile() {
		this.source.editTextFile();
	}

	@Override
	public void editWordFile() {
		System.out.println("编辑Word文件");
	}
}
