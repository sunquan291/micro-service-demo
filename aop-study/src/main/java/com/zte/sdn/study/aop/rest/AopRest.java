package com.zte.sdn.study.aop.rest;

import com.zte.sdn.study.aop.config.AopConfig;
import com.zte.sdn.study.aop.config.PluginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Livio
 * @Date: 2021/2/2 23:22
 */
@RestController
public class AopRest {

    @Autowired
    private AopConfig aopConfig;

    @GetMapping("/config")
    public String getConfig() {
        List<PluginBean> plugins = aopConfig.getPlugins();
        return plugins.toString();
    }
}
