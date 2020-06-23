package es.leroymerlin.oms.stock.api.controller;

import es.leroymerlin.oms.stock.api.model.Hello;
import es.leroymerlin.oms.stock.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public Hello sayHello() {
        log.info("Say Hello");
        return helloService.sayHello();
    }
}
