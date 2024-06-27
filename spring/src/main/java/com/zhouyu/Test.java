package com.zhouyu;

import com.spring.ZhouyuApplicationContext;
import com.zhouyu.service.UserService;

public class Test {
    public static void main(String[] args) {
        ZhouyuApplicationContext zhouyuApplicationContext =  new ZhouyuApplicationContext(AppConfig.class);
        UserService userService = (UserService) zhouyuApplicationContext.getBean("userService");
        userService.test();

    }
}
