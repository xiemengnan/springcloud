package com.xmn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiemengnan
 * @date 2019/4/716:51
 * @Description: TODO
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口："+port;
    }
}
