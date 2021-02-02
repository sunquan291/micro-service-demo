package com.zte.sdn.plugin.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: Livio
 * @Date: 2021/2/2 23:10
 */
public class InvokeCostAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long current = System.currentTimeMillis();
        Object proceed = null;
        try {
            proceed = methodInvocation.proceed();
        } finally {
            String timeString = String.format("[%s] cost:%d ms", methodInvocation.getMethod().getName(), System.currentTimeMillis() - current);
            System.out.println(timeString);
        }
        return proceed;
    }
}
