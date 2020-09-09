package malf.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author malf
 * @createTime 2020/9/9
 * @description 加载 Amazon 相关的配置属性
 */
@Component
@ConfigurationProperties("amazon")	// 注入带 amazon 前缀的属性
public class AmazonProperties {
	private String associateId;

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
}
