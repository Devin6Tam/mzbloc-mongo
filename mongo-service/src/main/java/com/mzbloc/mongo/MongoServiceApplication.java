package com.mzbloc.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:/dubbo.xml"})
public class MongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoServiceApplication.class, args);
		try {
			//阻塞作用，否则会由于不是web项目，执行main方法后立即停止服务。
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

