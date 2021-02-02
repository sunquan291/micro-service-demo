package com.zte.sdn.demo.thread;

/**
 * @Author: Livio
 * @Date: 2020/11/23 22:30
 */
public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            System.out.println("thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //SQ:调用了 join(0); 使用wait和notify进行线程控制，注意阻塞的是主线程
        //那主线程被阻塞了，何时会被通知解锁？
        //在Thread线程执行完，Thread.cpp会固定地调用void JavaThread::exit-->ensure_join
        //其主要作用就是notify waiters on thread object,最终使用lock.notify_all(thread)来释放在join方法上的synchronized锁
        thread.join();
        System.out.println("end");
    }
}
