package com.dovelol.ribbonconsumer;

import com.dovelol.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dovelol
 * @date 2019/8/17 21:41
 */

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/ribbon-consumer")
    private String helloConsumer(){
        return helloService.helloService();
    }


}
