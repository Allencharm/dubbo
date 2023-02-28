package com.dubbo.impl;

import com.dubbo.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author ldq
 * @version 1.0
 * @date 2023/2/28 9:48
 * @Description: 提供方实现类
 */
@Service
public class DubboServiceImpl implements DubboService{
    public String getString() {
        return "provider 提供方.....................";
    }
}
