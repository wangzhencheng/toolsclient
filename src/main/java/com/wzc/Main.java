package com.wzc;

import com.wzc.controller.IndexController;
import com.wzc.httpServer.core.SocketHttpHelper;
/**
 * @Name Main
 * @Description  程序入口
 * @Author 王贞成
 * @CreateDate 2018/5/17
 */
public class Main {

    public static void main(String[] args) {
        new SocketHttpHelper()
                .addHandlerByClass(IndexController.class)
                .start();
    }

}
