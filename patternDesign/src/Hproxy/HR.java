package Hproxy;

/**
 * @author malf
 * @Description 公司的HR
 * @project patternDesign
 * @since 2020/8/23
 */
public class HR implements Company {
	@Override
	public void findWorker(String title) {
		System.out.println("我需要招人，职位是：" + title);
	}
}
