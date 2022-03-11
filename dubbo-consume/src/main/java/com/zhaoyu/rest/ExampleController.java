package com.zhaoyu.rest;

import com.zhaoyu.service.ExampleService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqiangqiang
 * @description: 示例rest
 * @date 2022/3/11 3:14 PM
 */
@RestController
@RequestMapping("/dubbo")
public class ExampleController {
	@DubboReference(interfaceName = "exampleService", version = "1.0.0")
	private ExampleService exampleService;

	public ResponseEntity<String> getString() {
		return ResponseEntity.ok(exampleService.getString());
	}
}
