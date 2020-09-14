package Piterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author malf
 * @Description List集合
 * @project patternDesign
 * @since 2020/8/23
 */
public class ListCollection implements Collection {
	public List list = new ArrayList();
	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Object get(int i) {
		return list.get(i);
	}

	@Override
	public boolean add(Object object) {
		list.add(object);
		return true;
	}

	@Override
	public int size() {
		return list.size();
	}
}
