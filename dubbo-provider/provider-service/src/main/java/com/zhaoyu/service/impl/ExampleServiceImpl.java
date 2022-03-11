package com.zhaoyu.service.impl;

import com.zhaoyu.service.ExampleService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jiangqiangqiang
 * @description: 服务实现类
 * @date 2022/3/11 2:55 PM
 */
@DubboService(interfaceName = "exampleService", version = "1.0.0")
public class ExampleServiceImpl implements ExampleService {
	@Override
	public String getString() {
		// 业务处理 ......
		return "dubbo example";
	}
}
