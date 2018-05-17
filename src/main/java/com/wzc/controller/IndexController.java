package com.wzc.controller;

import com.wzc.httpServer.core.Handler;
import com.wzc.httpServer.core.Request;

/**
 * @Name IndexController
 * @Description 测试Demo
 * @Author 王贞成
 * @CreateDate 2018/5/17
 */
public class IndexController {


    @Handler(value = {"/", "/index"})
    public String index(Request request) {
        return "欢迎使用工具客户端";
    }

}
