package com.example.provider;

import com.example.api.GreetingService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zy
 * @version 1.0
 * @description GreetingService实现类
 * @date 2023/3/24 9:49
 */
@DubboService
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting(String name) {
        return "Hello, " + name;
    }
}
