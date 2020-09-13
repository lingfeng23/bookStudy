package Piterator;

/**
 * @author malf
 * @Description 迭代器接口
 * @project patternDesign
 * @since 2020/8/23
 */
public interface Iterator {
	// 指针前移
	public Object previous();
	// 指针后移
	public Object next();
	public boolean hasNext();
}
