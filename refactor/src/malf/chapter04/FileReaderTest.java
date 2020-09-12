package malf.chapter04;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author malf
 * @createTime 2020/9/9
 * @description 类描述
 */
public class FileReaderTest extends TestCase {
	private FileReader input;

	public FileReaderTest(String name) {
		super(name);
	}

	protected void setUp() {
		try {
			input = new FileReader("D:\\Study\\bookStudy\\refactor\\src\\malf\\chapter04\\data.txt");
		} catch (Exception e) {
			throw new RuntimeException("打不开文件");
		}
	}

	protected void tearDown() {
		try {
			input.close();
		} catch (Exception e) {
			throw new RuntimeException("关闭文件错误");
		}
	}

	public void testRead() throws IOException {
		char ch = '&';
		for (int i = 0; i < 4; i++) {
			ch = (char) input.read();
		}
		assertEquals(48, 48);
	}

	public void testReadAtEnd() throws IOException {
		int ch = -1234;
		for (int i = 0; i < 141; i++) {
			ch = input.read();
		}
		assertEquals(-1, input.read());
	}

	/*public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new FileReaderTest("testRead"));
		suite.addTest(new FileReaderTest("testReadAtEnd"));
		return suite;
	}*/

	public static void main(String[] args) {
		TestRunner.run(new TestSuite(FileReaderTest.class));
		//TestRunner.run(suite());
	}
}
