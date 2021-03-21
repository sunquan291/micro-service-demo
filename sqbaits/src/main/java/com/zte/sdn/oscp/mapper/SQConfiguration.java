package com.zte.sdn.oscp.mapper;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @Author: Livio
 * @Date: 2021/3/21 22:14
 */
public class SQConfiguration {

    public static final ResourceBundle sqlMappings;

    static {
        sqlMappings = ResourceBundle.getBundle("sql");
    }

    public <T> T getMapper(Class<T> cls, SQSqlSession session) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{cls}, new SQMapperProxy(session));
    }
}
