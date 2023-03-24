package com.example.api;

import java.util.concurrent.CompletableFuture;

/**
 * @author zy
 * @version 1.0
 * @description RPC接口
 * @date 2023/3/24 9:48
 */

public interface GreetingService {

    String greeting(String name);

    default String replyGreeting(String name) {
        return "Fine, " + name;
    }

    //异步调用重载
    default CompletableFuture<String> greeting(String name, byte signal) {
        return CompletableFuture.completedFuture(greeting(name));
    }

}