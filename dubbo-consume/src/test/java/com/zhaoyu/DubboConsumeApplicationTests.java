package com.zhaoyu;

import com.zhaoyu.service.ExampleService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboConsumeApplicationTests {
	@DubboReference(interfaceName = "exampleService", version = "1.0.0")
	ExampleService exampleService;
	@Test
	void contextLoads() {
	}

}
