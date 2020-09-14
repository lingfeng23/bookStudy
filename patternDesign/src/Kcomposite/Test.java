package Kcomposite;

import com.alibaba.fastjson.JSON;

/**
 * @author malf
 * @Description 测试组合模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		nodeA.add(nodeB);
		System.out.println(JSON.toJSONString(nodeA));
	}
}
