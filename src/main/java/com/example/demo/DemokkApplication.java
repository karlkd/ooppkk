package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemokkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokkApplication.class, args);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		//输出日志文件
//		logger.info("the first jsp pages");
//		//返回一个index.jsp这个视图
		return "index";

	}
}

