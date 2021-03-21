package com.zte.sdn.oscp.mapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Livio
 * @Date: 2021/3/21 22:19
 */
public class SQMapperProxy implements InvocationHandler {

    private SQSqlSession session;

    public SQMapperProxy(SQSqlSession session) {
        this.session = session;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String interfaceName = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = interfaceName + "." + methodName;
        //这里固定了SQL语句的key值，即方法的全路径名，这与原生的mapper.xml中定义要对应方法名一致，算一个约定
        return session.selectOne(statementId, args[0]);
    }
}
