package com.Lyle.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.Lyle")
@MapperScan("com.Lyle.server.mapper")
public class SystemApplication {
	private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SystemApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("启动成功！");
		LOG.info("System地址：\thttp://localhost:{}", env.getProperty("server.port"));
	}

}
