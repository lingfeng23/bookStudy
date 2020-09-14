package Lflyweight;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author malf
 * @Description 内存管理工厂
 * @project patternDesign
 * @since 2020/8/23
 */
public class MemoryFactory {
	private static List<Memory> memories = new ArrayList<>();

	public static Memory getMemory(int size) {
		Memory memory = null;
		for (int i = 0; i < memories.size(); i++) {
			memory = memories.get(i);
			// 如果存在和需求size一样大小且未使用的内存则直接返回
			if (memory.getSize() == size && memory.isUsed() == false) {
				memory.setUsed(true);
				memories.set(i, memory);
				System.out.println("从内存列表中获取内存：" + JSON.toJSONString(memory));
				break;
			}
		}
		// 如果内存不存在，则从系统中申请新的内存并返回，并将该内存加入到列表中
		if (memory == null) {
			memory = new Memory(32, false, UUID.randomUUID().toString());
			System.out.println("新建一个内存：" + JSON.toJSONString(memory));
			memories.add(memory);
		}
		return memory;
	}
	public static void releaseMemory(String id) {
		for (int i = 0; i < memories.size(); i++) {
			Memory memory = memories.get(i);
			// 如果存在和需求size一样大小且未使用的内存则直接返回
			if (memory.getId().equals(id)) {
				memory.setUsed(false);
				memories.set(i, memory);
				System.out.println("释放内存。");
				break;
			}
		}
	}
}
