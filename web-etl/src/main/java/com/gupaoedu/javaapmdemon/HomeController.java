package com.gupaoedu.javaapmdemon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/")
    public ResponseEntity<String> Home() {
        ResponseEntity<String> resultEntity=new ResponseEntity<String>(200,"ok","Hello Api");
        return resultEntity;
    }

}

