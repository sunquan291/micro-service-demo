package com.zte.sdn.study.aop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Livio
 * @Date: 2021/2/2 23:06
 */
@Configuration
@ConfigurationProperties("aop-plugin")
public class AopConfig {

    private List<PluginBean> plugins ;

    public List<PluginBean> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<PluginBean> plugins) {
        this.plugins = plugins;
    }
}
