package com.zte.sdn.demo.thread;

/**
 * @Author: Livio
 * @Date: 2020/11/23 22:48
 */

public class ThreadLocalTest {
    ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return "abc";
        }
    };

    public static void main(String[] args) {

    }
}
