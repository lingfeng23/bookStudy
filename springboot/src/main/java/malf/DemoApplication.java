package malf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// 开启组件扫描和自动配置
// SpringBootApplication = Configuration + ComponentScan + EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		// 负责启动引导应用程序
		SpringApplication.run(DemoApplication.class, args);
	}

}
