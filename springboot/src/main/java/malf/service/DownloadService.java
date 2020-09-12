package malf.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @author malf
 * @createTime 2020/9/12
 * @description 下载文件服务类
 */
@Service
public class DownloadService {
	public void logDownload(String name, HttpServletResponse response) throws Exception {
		// TODO 路径正确则可以实现下载
		File file = new File("D:\\Study\\bookStudy\\springboot\\logs\\test.txt");
		if (!file.exists()) {
			throw new Exception(name + "文件不存在");
		}
		response.setContentType("application/force-download");
		response.addHeader("Content-Disposition", "attachment;fileName=" + name);

		byte[] buffer = new byte[1024];
		try (FileInputStream fis = new FileInputStream(file);
			 BufferedInputStream bis = new BufferedInputStream(fis)) {
			OutputStream os = response.getOutputStream();
			int i = bis.read(buffer);
			while (i != -1) {
				os.write(buffer, 0, i);
				i = bis.read(buffer);
			}
		}
	}
}
