package com.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ldq
 * @version 1.0
 * @date 2023/2/28 11:00
 * @Description: 消费方控制层
 */
@RestController
public class DubboController {
    @Autowired
    private DubboService dubboService;

    @RequestMapping("first")
    public Map<String,String> first(){
        //远程调用，将结果响应页面
        String string = dubboService.getString();
        HashMap<String, String> map = new HashMap<>();
        map.put("key", string);
        return map;
    }
}
