package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestController {

	// http://localhost:8080/greeting?name=shangcg  访问测试路径  测试服务是否启动

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new String(name);
	}


}
