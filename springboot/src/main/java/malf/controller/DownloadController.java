package malf.controller;

import malf.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author malf
 * @createTime 2020/9/12
 * @description 文件操作控制器
 */
@RestController
public class DownloadController {
	@Autowired
	DownloadService downloadService;

	@RequestMapping("/download/{name}")
	public void download(@PathVariable String name, HttpServletResponse response) throws Exception {
		downloadService.logDownload(name, response);
	}
}
