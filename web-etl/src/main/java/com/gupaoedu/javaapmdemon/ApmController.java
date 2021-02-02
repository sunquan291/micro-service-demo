package com.gupaoedu.javaapmdemon;

import co.elastic.apm.api.CaptureSpan;
import co.elastic.apm.api.ElasticApm;
import co.elastic.apm.api.Span;
import co.elastic.apm.api.Transaction;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user:Elastic King
 * @date:2020/7/31 0031 20:47
 * @desc: ┏┛ ┻━━━━━┛ ┻┓
 * ┃　　　　　　 ┃
 * ┃　　　━　　　┃
 * ┃　┳┛　  ┗┳　┃
 * ┃　　　　　　 ┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　 ┃
 * ┗━┓　　　┏━━━┛
 * ┃　　　┃   Code is far away from bug with the animal protecting
 * ┃　　　┃
 * ┃　　　┗━━━━━━━━━┓
 * ┃　　　　　　　    ┣┓
 * ┃　　　　         ┏┛
 * ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * ┃ ┫ ┫   ┃ ┫ ┫
 * ┗━┻━┛   ┗━┻━┛
 */
@RestController
@RequestMapping("/apm")
public class ApmController {
    Thread
    @RequestMapping("notify")
    public ResponseEntity<String> Notify(@RequestBody String strBody) {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api");
        System.out.println("来自Watcher 错误告警通知："+System.currentTimeMillis());
        System.out.println(strBody);
        return resultEntity;
    }

    @RequestMapping("api1")
    public ResponseEntity<String> Api1() {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 111111111");

        Method0_1000();
        return resultEntity;
    }

    @RequestMapping("api2")
    public ResponseEntity<String>  Api2() throws InterruptedException {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 2222222222");

        Method0_2000();
        return resultEntity;
    }

    @RequestMapping("api3")
    public ResponseEntity<String>  Api3() throws InterruptedException {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 33333333");

        Method0_3000();
        return resultEntity;
    }

    @RequestMapping("api4")
    public ResponseEntity<String>  Api4() throws InterruptedException {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 44444444444");

        int xxx=Integer.parseInt("xx1");
        return resultEntity;
    }

    @RequestMapping("api5")
    public ResponseEntity<String>  Api5() throws InterruptedException {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 555555555");

        Method0_5000();
        return resultEntity;
    }
    @RequestMapping("api6")
    public ResponseEntity<String>  Api6() throws InterruptedException {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api 666666666");

        Method0_6000();
        return resultEntity;
    }
    void Method0_1000() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void Method0_2000() {
        try {
            Method0_1000();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void Method0_3000() {
        try {
            Method0_1000();
            Method0_2000();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void Method0_5000() {
        Span parent = ElasticApm.currentSpan();
        Span span=parent.startSpan();
        try {
            span.setName("Method0_5000");
            // do your thing...

            Thread.sleep(1111);
        } catch (Exception e) {
            span.captureException(e);
        } finally {
            span.end();
        }
        Method0_5001();
    }
    void Method0_5001() {
        Span parent = ElasticApm.currentSpan();
        Span span=parent.startSpan();
        try {
            span.setName("Method0_5001");
            // do your thing...

            Thread.sleep(2222);
        } catch (Exception e) {
            span.captureException(e);
        } finally {
            span.end();
        }
        Method0_5002();
    }
    void Method0_5002() {
        Span parent = ElasticApm.currentSpan();
        Span span=parent.startSpan();
        try {
            span.setName("Method0_5002");
            // do your thing...

            Thread.sleep(3333);
        } catch (Exception e) {
            span.captureException(e);
        } finally {
            span.end();
        }
        Method0_5003();
    }
    void Method0_5003() {
        Span parent = ElasticApm.currentSpan();
        Span span=parent.startSpan();
        try {
            span.setName("Method0_5003");
            // do your thing...
            Thread.sleep(3333);
        } catch (Exception e) {
            span.captureException(e);
        } finally {
            span.end();
        }
    }

    void Method0_6000() {
        Transaction transaction = ElasticApm.startTransaction();
        try {
            transaction.setName("ApmController#Method0_6000");
            transaction.setType(Transaction.TYPE_REQUEST);
            // do your thing...

            Thread.sleep(1111);
        } catch (Exception e) {
            transaction.captureException(e);
        } finally {
            transaction.end();
        }
        Method0_6001();

    }
    void Method0_6001() {
        Span parent = ElasticApm.currentSpan();
        Span span=parent.startSpan();
        try {
            span.setName("Method0_6001");
            // do your thing...
            Thread.sleep(2222);
        } catch (Exception e) {
            span.captureException(e);
        } finally {
            span.end();
        }

    }
}